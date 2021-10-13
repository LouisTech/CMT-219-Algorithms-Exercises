import java.util.Random;
public class Consumer extends Thread{
    public Consumer(Buffer buffer){
        this.buffer = buffer;
    }
    
    public void run() {
        Random rand = new Random();
        try {
            for(int i = 1; i <= 100; i++){
                if(buffer.isEmpty()){
                    System.out.println("Buffer empty!");
                }else{
                    System.out.println("Removed" + buffer.get());
                }
                Thread.sleep(rand.nextInt(101)+50);
            }
        } 
        catch (InterruptedException ie){
            System.out.println("Interrupted");
        }
    }

    private Buffer buffer;
}

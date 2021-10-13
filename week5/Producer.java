import java.util.Random;
public class Producer extends Thread{
    public Producer(Buffer buffer){
        this.buffer = buffer;
    }
    
    public void run() {
        Random rand = new Random();
        try {
            for(int i = 1; i <= 100; i++){
                if(buffer.isFull()){
                    System.out.println("Buffer full!");
                }else{
                    buffer.put(i);
                    System.out.println("Added " + i);
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

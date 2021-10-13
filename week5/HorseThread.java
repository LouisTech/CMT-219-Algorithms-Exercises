import java.util.Random;
public class HorseThread extends Thread{
    public HorseThread(int id){
        this.id = id;
    }
    
    public void run(){
        distanceRun = 0;
        time = 0;
        Random rand = new Random();
        try{
            while(distanceRun < RACE_DISTANCE){
                Thread.sleep(10);
                time += 10;
                distanceRun += rand.nextInt(6)+1;
            }
        }
        catch(InterruptedException ie){
            System.out.println("Interrupted in sleep");
        }

        System.out.println("Horse " + this.id + " finished with a time of " + this.time +"ms!");
    }
    public int getTime(){
        return time;
    }
    public int getID(){
        return id;
    }
    private int id;
    private int time;
    private int distanceRun;
    private static final int RACE_DISTANCE = 1000;
}

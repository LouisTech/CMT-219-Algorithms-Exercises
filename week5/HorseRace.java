public class HorseRace {
    public static void main(String[] args) {
        final int HORSE_NUM = 10;
        HorseThread[] horses = new HorseThread[HORSE_NUM];
        System.out.println("STARTING RACE!");
        for(int i = 0; i<HORSE_NUM; i++){
            horses[i] = new HorseThread(i+1);
            horses[i].start();
        }
        try {
            for(int i = 0; i<HORSE_NUM; i++){
                horses[i].join();
            }
        } catch (Exception e) {
            System.out.println("Something went wrong!");
        }

        int bestTime = Integer.MAX_VALUE;
        int bestHorse = -1;
        for(int i = 0; i<HORSE_NUM; i++){
            int t = horses[i].getTime();
            if(t < bestTime){
                bestTime = t;
                bestHorse = i;
            }
        }

        System.out.println("The winner is Horse " + horses[bestHorse].getID() + " with a time of " + bestTime + "ms!");
    }
}

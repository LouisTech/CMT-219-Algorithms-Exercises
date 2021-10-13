import java.util.Random;
public class RandomNumbers {
    public static void main(String[] args) {
        System.out.println("Output 16 random numbers in the range 3 to 6: ");
        Random random = new Random();
        for(int i = 0; i<16; i++){
            System.out.print(random.nextInt(4)+3);
        }

        System.out.println("\nOutput 20 random numbers in the range 4 to 8: ");
        for(int i = 0; i<20; i++){
            System.out.print(random.nextInt(5)+4);
        }
    } 
}

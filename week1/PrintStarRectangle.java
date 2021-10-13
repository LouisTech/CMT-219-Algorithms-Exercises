import java.util.Scanner;
public class PrintStarRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width and height: ");

        int width = scanner.nextInt();
        int height = scanner.nextInt();

        for(int i = 0; i<height; i++){
            for(int j = 0; j<width; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
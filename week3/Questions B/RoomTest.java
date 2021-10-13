import java.util.Scanner;
public class RoomTest {
    public static void main(String[] args) {
        System.out.println("Enter the room length followed by width: ");
        Scanner in = new Scanner(System.in);
        double length = in.nextDouble();
        double width = in.nextDouble();

        System.out.println("Enter the carpte cost (per square metre): ");
        double cost = in.nextDouble();
        in.close();
        

        
        RoomDimension room = new RoomDimension(length, width);
        RoomCarpet carpet = new RoomCarpet(room, cost);

        System.out.println(carpet.getTotalCost());
    }
}

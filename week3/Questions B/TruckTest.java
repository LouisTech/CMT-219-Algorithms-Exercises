public class TruckTest {
    public static void main(String[] args) {
        Person steve = new Person("Steven Stevenson");
        Truck cyberTruck = new Truck("Tesla", 0, steve, 150.5, 50);

        System.out.println(cyberTruck);
    }
}

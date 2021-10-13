import java.awt.Point;
public class tests {
	public static void main( String[] args ) {
        int x = 3;
        Integer y = x + 5;
        System.out.println("y = " + y);
        System.out.println("y == 8 : " + (y == 8));
        Integer z = new Integer(8);
        System.out.println("y == z : " + (y == z));
        // Use the intValue() method of class Integer to obtain
        int v = z.intValue();
        System.out.println("y == v : " + (y == v));

}
}
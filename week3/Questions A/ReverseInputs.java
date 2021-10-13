import java.util.Scanner;
import java.util.Vector;
public class ReverseInputs {
    public static void main(String[] args) {
        System.out.println("PLEASE ENTER TEXT. ENTER A BLANK LINE WHEN YOU ARE FINISHED");
        Vector<String> v = new Vector<String>();
        String line;
        try {
            Scanner in = new Scanner(System.in);
            while (!(line = in.nextLine()).equals("")) {
                v.add(line);
            }
            in.close();
        }
        catch ( Exception e ) {
            System.out.println( e );
        }

        System.out.println("YOUR INPUT REVERSED:");
        for(int i = 0; i < v.size(); i++){
            System.out.println(new StringBuffer(v.elementAt(i)).reverse());
        }
    }
}

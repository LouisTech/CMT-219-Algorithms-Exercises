import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
public class FivesWriter {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("times5.txt");
            PrintWriter out = new PrintWriter(writer);
            for(int i = 1; i<=12; i++){
                int multiple = 5 * i;
                out.println(i + " x 5 = " + multiple);
            }
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

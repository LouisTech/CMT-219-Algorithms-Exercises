import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
public class MultiplesWriter {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter(args[1]);
            PrintWriter out = new PrintWriter(writer);
            for(int i = 1; i<=12; i++){
                int multiple = Integer.parseInt(args[0]) * i;
                out.println(i + " x " + args[0] + " = " + multiple);
            }
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

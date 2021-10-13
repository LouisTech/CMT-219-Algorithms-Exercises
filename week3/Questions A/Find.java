import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Find {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(new File(args[args.length - 1]));
            while ( in.hasNextLine() ) {
                String text = in.nextLine();
                if(args[0].equals("-i")){
                    if(text.toLowerCase().contains(args[1].toLowerCase())){
                        System.out.println(text);
                    }
                }else{
                    if(text.contains(args[1])){
                        System.out.println(text);
                    }
                }
            }
            in.close();
        }
        catch ( FileNotFoundException e ) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

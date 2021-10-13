import java.util.Map;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
public class Login {
    public static void main(String[] args) {
        System.out.println("Enter username and password");
        Scanner input = new Scanner(System.in);
        String userName = input.nextLine();
        String password = input.nextLine();
        input.close();
        
        Map<String, String> users = new HashMap<String, String>();

        try {
            Scanner file = new Scanner(new File("users.txt"));
            while(file.hasNext()){
                String user = file.next();
				String pass = file.next();
				users.put(user, pass);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if(users.containsKey(userName) && users.get(userName).equals(password)){
            System.out.println("Login found!");
        }else{
            System.out.println("Login not found!");
        }
    }
}

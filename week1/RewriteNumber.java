// package import missing
import java.util.Scanner;
public class RewriteNumber {
	public static void main( String args[] ) {
	    Scanner in = new Scanner( System.in );

	    System.out.println( "Enter an integer between 0 and 9" );
	    int num = in.nextInt();v
	    String output = "";
		if (num == 1){
			output = "one";
		}else if(num == 2){
			output = "two";
		}else if(num == 3){
			output = "three";
		}else if(num == 4){
			output = "four";
		}else if(num == 5){
			output = "five";
		}else if(num == 6){
			output = "six";
		}else if(num == 7){
			output = "seven";
		}else if(num == 8){
			output = "eight";
		}else if(num == 9){
			output = "nine";
		}
		System.out.println( "(if else if) You entered " + output);
		switch(num){
			case 1:
				output = "one";
				break;
			case 2:
				output = "two";
				break;
			case 3:
				output = "three";
				break;
			case 4:
				output = "four";
				break;
			case 5:
				output = "five";
				break;
			case 6:
				output = "six";
				break;
			case 7:
				output = "seven";
				break;
			case 8:
				output = "eight";
				break;
			case 9:
				output = "nine";
				break;
				
		}
	    System.out.println( "(switch) You entered " + output);
	}
}

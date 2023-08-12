package logicalOperatorValidator;
import java.util.Scanner;
public class validator {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Is input valid (true/false): ");
		boolean vaildinput= scan.nextBoolean();
		System.out.println("Does input meet a certain condition (true/false): ");
		boolean meetscondition= scan.nextBoolean();
		
		boolean result=isValidInput(vaildinput,meetscondition);
		if(result==true) {
			System.out.println("Input is valid");
		}
		else{
			System.out.println("Input is not valid");
		}
        scan.close();
	}
	public static boolean isValidInput(boolean vaildinput, boolean meetscondition){
		return vaildinput&&meetscondition;
	}

}

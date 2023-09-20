package meaningOfGrade;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
         Scanner scan=new Scanner(System.in);
         System.out.println("Enter your Grade:");
         System.out.println("eg: A, B, C, D, E, F");
         char ch= scan.next().charAt(0);
         mean(ch);
         scan.close();
    
	}
	public static void mean(char ch) {
		switch(ch) {
		case 'A': 
			System.out.println("Excellent");
			break;
	    case 'B': 
		    System.out.println("Good");
		    break;
	    case 'C': 
		    System.out.println("Average");
		    break;
	    case 'D': 
		    System.out.println("Deficient");
		    break;
	    case 'F': 
		    System.out.println("Failing");
		    break;
		default:
			System.out.println("Check your Entries");
			break;
	}

	}

}

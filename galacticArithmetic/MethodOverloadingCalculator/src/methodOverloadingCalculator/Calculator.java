package methodOverloadingCalculator;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
     Scanner scan= new Scanner(System.in);
     System.out.println("Enter the first number: ");
     int num1= scan.nextInt();
     System.out.println("Enter the second number: ");
     int num2= scan.nextInt();
     System.out.println("Enter the operator (+, -, *, /): ");
     char operator= scan.next().charAt(0);
     System.out.println("Result: "+calculate(num1,num2,operator));
     scan.close();
	}
	public static int calculate(int num1,int num2, char operator) {
		switch(operator) {
	    case '+':
	    	return num1+num2;
	    case '-':
	    	return num2-num1;
	    case '*':
	    	return num1*num2;
	    case '/':
	    	return num2/num1;
	    default:
	    	return 0;
	    }
		
	}

}

package kodnestPractise;
import java.util.Scanner;
public class MultiFloat {

	public static void main(String[] args) {
          Scanner scan= new Scanner(System.in);
          System.out.println("Enter two no. ");
          float num1= scan.nextFloat();
          float num2= scan.nextFloat();
          System.out.println("The Result is: "+multipyno(num1,num2));
          scan.close();
          
	}
	public static float multipyno(float num1, float num2) {
		return num1*num2;
	}

}

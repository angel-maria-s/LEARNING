package kodnestPractise;
import java.util.Scanner;
public class Welcome {

	public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          System.out.println("enter a number: ");
          int marks= scan.nextInt();
          System.out.println("Welcome to kodnest");
          welcometechie(marks);
          scan.close();
          
	}
	public static void welcometechie(int marks) {
		if(marks>=80) {
			System.out.println("welcome to Tech Club");
		}
	}

}

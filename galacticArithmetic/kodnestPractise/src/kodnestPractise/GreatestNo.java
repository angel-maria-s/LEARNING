package kodnestPractise;
import java.util.Scanner;
public class GreatestNo {

	public static void main(String[] args) {
     Scanner scan= new Scanner(System.in);
     System.out.println("input the 1st Number: ");
     int a= scan.nextInt();
     System.out.println("input the 2nd Number: ");
     int b= scan.nextInt();
     System.out.println("input the 3rd Number: ");
     int c= scan.nextInt();
     printGreatest(a,b,c);
     scan.close();

	}
	public static void printGreatest(int a, int b, int c) {
		if(a>b && a>c) {
			System.out.println("The greatest: "+a);
		}
		else if(b>a && b>c) {
			System.out.println("The greatest: "+b);	
		}
		else {
			System.out.println("The greatest: "+c);
		}
	}

}

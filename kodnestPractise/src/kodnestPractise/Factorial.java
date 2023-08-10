package kodnestPractise;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
     Scanner scan= new Scanner(System.in);
     int n =scan.nextInt();
     System.out.println("Factorial: "+calculateFactorial(n));
     scan.close();
	}
	public static int calculateFactorial(int n) {
		return n*calculateFactorial(n-1);
	}

}

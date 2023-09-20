package kodnestPractise;

import java.util.Scanner;
public class main {
	Scanner scan= new Scanner(System.in);
	double price = scan.nextDouble();
	double taxRate = scan.nextDouble();
	
	public static void displayPriceTax(double price, double taxRate) {
		System.out.println("Price with Tax: "+(price+taxRate));
		
	}

}

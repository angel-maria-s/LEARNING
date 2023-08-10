package kodnestPractise;

import java.util.Scanner;
public class Taxxxxx {
	public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	double price = scan.nextDouble();
	double taxRate = scan.nextDouble();
	System.out.println("Price with Tax:"+displayPriceTax(price,taxRate));
	scan.close();
	}
	
	public static double displayPriceTax(double price, double taxRate){
		return price +(price *taxRate);
		
	}
	

}

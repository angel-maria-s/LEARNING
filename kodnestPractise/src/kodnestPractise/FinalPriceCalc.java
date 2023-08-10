package kodnestPractise;
import java.util.Scanner;
public class FinalPriceCalc {
	
	public static double cfc(double product, double discount) {
		double price= product*discount;
		return product-price;
	}

	public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        double product= scan.nextDouble();
        double discount= scan.nextDouble();
        System.out.println(cfc(product,discount));
        scan.close();
        
	}

}

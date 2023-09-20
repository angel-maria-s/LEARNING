package TaxCalculator;
import java.util.Scanner;
public class taxCalculator {

	public static void main(String[] args) {
    Scanner scan= new Scanner(System.in);
    System.out.println("Enter the purchase amount: ");
    double purchaseamount= scan.nextDouble();
    System.out.println("Enter the tax rate (in decimal form): ");
    double taxrate= scan.nextDouble();
    System.out.println("Total cost including tax: "+calculateTotalWithTax(purchaseamount,taxrate));
    scan.close();
	}
    public static double calculateTotalWithTax(double purchaseamount, double taxrate) {
    	double taxamount= purchaseamount * taxrate;
    	return taxamount+purchaseamount;
    }
}

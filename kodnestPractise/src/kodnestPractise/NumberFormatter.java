package kodnestPractise;
import java.util.Scanner;
public class NumberFormatter {

	public static void main(String[] args) {
         Scanner scan =new Scanner(System.in); 
         int countryCode= scan.nextInt();
         int cityCode= scan.nextInt();
         long number= scan.nextLong();
         printPhoneNumber(countryCode,cityCode,number);
         scan.close();
         
         
	}
	public static void printPhoneNumber(int countryCode,int cityCode, long number) {
		System.out.println("+"+countryCode+"("+ cityCode+")"+number);
	}

}

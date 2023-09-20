package kodnestPractise;
import java.util.Scanner;
public class PosNeg {

	public static void main(String[] args) {
         Scanner scan= new Scanner(System.in);
         System.out.println("Input a number: ");
         float num= scan.nextFloat();
         NoPosNeg(num);
         scan.close();
      }
	public static void NoPosNeg(float num){
		if(num==0){
			System.out.println("Number is zero");
		}
		else if(num>0) {
			System.out.println("Number is Positive");
		}				
		else {
			System.out.println("Number is Negative");
		}
	}

}

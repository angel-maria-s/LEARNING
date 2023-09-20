package kodnestPractise;

import java.util.Scanner;

public class Less {

	public static void main(String[] args) {
         Scanner scan= new Scanner(System.in);
         int num1=scan.nextInt();
         int num2= scan.nextInt();
         if(num1<num2 && num2>num1) {
        	 System.out.println(true);
         }
         else {
        	 System.out.println(false);
         }
         scan.close();
	}

}

package gCDcalculator;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		FindGCD(a,b);
		scan.close();
}

	 public static void FindGCD(int a,int b) {
		 while(b!=0) {
			int rem=a%b;
			 a=b;
			 b=rem;
		 }
		 System.out.println(a);
	 } 
	 }

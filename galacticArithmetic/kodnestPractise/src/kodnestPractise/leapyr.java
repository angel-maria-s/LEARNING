package kodnestPractise;

import java.util.Scanner;

public class leapyr {

	public static void main(String[] args) {
     Scanner scan= new Scanner(System.in);
     int year= scan.nextInt();
     printleapyr(year);
     scan.close();
	}
	public static void printleapyr(int year) {
		if(year%4==0) {
			System.out.println("leap year");
		}
		else {
			System.out.println("not a leap year");
		}
	}

}

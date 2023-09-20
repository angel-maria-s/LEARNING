package kodnestPractise;

import java.util.Scanner;

public class QuadraticEqu {

	public static void main(String[] args) {
           Scanner scan= new Scanner(System.in);
           double a= scan.nextDouble();
           double b= scan.nextDouble();
           double c= scan.nextDouble();
           equ(a,b,c);
           scan.close();
           
	}
	public static void equ(double a, double b, double c) {
		double x= b*b-4*a*c;
		if(x>0) {
			System.out.println((-b+Math.sqrt(x))/2*a);
		}
		else {
			System.out.println((-b-Math.sqrt(x))/2*a);
		}
	}

}

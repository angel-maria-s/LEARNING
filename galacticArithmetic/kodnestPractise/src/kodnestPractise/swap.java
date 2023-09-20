package kodnestPractise;

import java.util.Scanner;

public class swap {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter num1: ");
		int num1= scan.nextInt();
		System.out.println("enter num2: ");
		int num2= scan.nextInt();
		swapno(num1, num2);
		scan.close();
       
	}
	public static void swapno(int num1, int num2) {
		int temp = num1;
		num1=num2;
		num2=temp;
		System.out.println("num1: "+num1);
		System.out.println("num2: "+num2);

	}

}

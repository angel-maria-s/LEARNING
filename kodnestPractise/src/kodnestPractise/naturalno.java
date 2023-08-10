package kodnestPractise;

import java.util.Scanner;

public class naturalno {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
        System.out.println("enter a num: ");
        int n= scan.nextInt();
        printnatural();
        printeven(n);
        printodd(n);
        scan.close();
	}
	public static void printnatural() {
		for(int i=1;i<=10;i++)
			System.out.println(i);
	}
	public static void printeven(int n) {
		for(int i=2;i<=n;i++)
			if(i%2==0)
			System.out.println(i);
	}
	public static void printodd(int n) {
		for(int i=0;i<=n;i++)
			if(i%2==1)
			System.out.println(i);
	}

}

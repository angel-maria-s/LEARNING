package kodnestPractise;

import java.util.Scanner;

public class Arm {

	public static void main(String[] args) {
			Scanner scan= new Scanner(System.in);
		    int n=scan.nextInt();
		    Armstrong(n);
		    scan.close();
	}
	 public static void Armstrong(int n) {
		 int temp=n;
    	 int rem=0;
    	 int res=0;

		 while(temp!=0) {
    	 rem=temp%10;
    	 res= res+(rem*rem*rem);
    	 temp/=10;
     }
     if(res==n) {
    	 System.out.println("Its an Armstrong Number");
     }
     else {
    	 System.out.println("Its not an Armstrong Number");
     }
}
}
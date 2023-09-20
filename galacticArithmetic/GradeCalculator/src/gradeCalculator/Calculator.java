package gradeCalculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
         Scanner scan= new Scanner(System.in);
         System.out.println("Enter your 3 Marks");
         int m1= scan.nextInt();
         int m2= scan.nextInt();
         int m3= scan.nextInt();
         int avg=(m1+m2+m3)/3;
         check(avg);
         scan.close();
         
	}
	public static void check(int avg) {
	     if(avg<100 && avg >90) {
	    	 System.out.println("A");
	     }
	     else if(avg<89 && avg >80) {
	    	 System.out.println("B");
	     }
	     else if(avg<79 && avg >70) {
	    	 System.out.println("C");
	     }
	     else if(avg<69 && avg >60) {
	    	 System.out.println("D");
	     }
	     else{
	    	 System.out.println("F");
	     }
	}

}

package fibonacciSeries;

import java.util.Scanner;

public class Main {
		public static void main(String[] args) {
			Scanner scan= new Scanner(System.in);
			int n=scan.nextInt();
			FibonacciSeries(n);
			scan.close();
	}
		 public static void FibonacciSeries(int n) {
			 int num1=0;
			 int num2=1;
			 for(int i=1;i<n;i++)
		    	{
				 int num3=num1+num2;
                 //System.out.print(num1+" ");
				 num1=num2;
				 num2=num3;
	
    			 }
			 System.out.println();
			 System.out.println("the "+n+"th element is "+num1);
		 }

}

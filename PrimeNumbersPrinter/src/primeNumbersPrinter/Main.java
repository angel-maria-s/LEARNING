package primeNumbersPrinter;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int n=scan.nextInt();
		printPrimes(n);
		scan.close();
	}
    public static void printPrimes(int n) {
        int count=0;
        int num=2;
        while(count<n) {
    	boolean res= checkPrime(num);
    	if(res==true) {
    		System.out.print(num+" ");
    		count++;
    	  }
    	num++;
    	}
     }
    public static boolean checkPrime(int num) {
    	for(int i=2;i<num;i++)
    	{
    		if(num%i==0)
    		{
    			return false;
    		}
    		
    	}
		return true;
    }
}
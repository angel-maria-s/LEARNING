package evenNumberPrinter;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int n=scan.nextInt();
		printEvenNumbers(n);
		scan.close();
	}
    public static void printEvenNumbers(int n) {
    	for(int i=2;i<=n;i+=2) {
    		
    		System.out.println(i);
    	}
    }
}

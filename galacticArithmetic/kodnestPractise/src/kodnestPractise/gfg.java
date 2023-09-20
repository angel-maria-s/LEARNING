package kodnestPractise;
import java.util.Scanner;
//Java program to find LCM of two numbers.
class gfg {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt(); 
		System.out.println("LCM of " + num1 + " and " + num2
						+ " is " + LCM(num1, num2));
		System.out.println(GCD(num1,num2));
		scan.close();
	}
	// of u and v using recursive method
	static int GCD(int num1, int num2)
	{
		if (num1 == 0)
			return num2;
		return GCD(num2 % num1, num1);
	}

	// LCM of two numbers
	static int LCM(int num1, int num2)
	{
		return (num1 / GCD(num1, num2)) * num2;
	}

	// The Driver method
	
}

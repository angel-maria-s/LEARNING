package testPalindrome;

import java.util.Scanner;

public class TestPalindrome {

	public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num= scan.nextInt();
        int res=check(num);
        if(res==num) {
        	System.out.println("Its a palindrome");
        }
        else {
        	System.out.println("Its not a palindrome");
        }
        scan.close();
        	}
	public static int check(int num) {
		int remainder=0;
        int temp=num;
        int rev=0;
        while(temp>0) {
        	remainder= temp%10;
        	rev= rev*10+remainder;
        	temp/=10;
        }
        return rev;
	}

}

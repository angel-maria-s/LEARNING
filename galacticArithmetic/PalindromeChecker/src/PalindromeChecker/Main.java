package PalindromeChecker;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    Scanner scan= new Scanner(System.in);
    Palindrome p1=new Palindrome();
	int n=scan.nextInt();
	p1.Palindromeofn(n);
	scan.close();
	}
}

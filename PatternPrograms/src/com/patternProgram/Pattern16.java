package com.patternProgram;

public class Pattern16 {
	public static void main(String[] args) {

		for(int k=1;k<=5;k++) {
			for(int m=1;m<=k;m++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++) {
			
			for(int j=5;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		}

}

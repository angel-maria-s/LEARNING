package com.patternProgram;

public class Pattern25 {
	public static void main(String[] args) {
		for(int k=1;k<=5;k++) {
			  for(int l=1;l<=5;l++) {
				System.out.print(" ");
			  }
			  for(int n=5;n>=k;n--) {
			  System.out.print("*");
			  }
			 System.out.println();
		}
		 for(int j=2;j<=5;j++) {
			  for(int i=1;i<=5;i++) {
				System.out.print(" ");
			  }
			  for(int m=1;m<=j;m++) {
			  System.out.print("*");
			  }
			 System.out.println();
		}
	}

}
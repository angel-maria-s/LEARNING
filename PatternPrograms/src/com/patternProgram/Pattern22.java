package com.patternProgram;

public class Pattern22 {
	public static void main(String[] args) {
		
		 for(int j=1;j<=5;j++) {
		  for(int i=1;i<=j;i++) {
			System.out.print(" ");
		  }
		  for(int m=1;m<=5;m++) {
		  System.out.print("*");
		  }
		 System.out.println();
	}
		 for(int k=1;k<=5;k++) {
			  for(int l=5;l>=k;l--) {
				System.out.print(" ");
			  }
			  for(int n=1;n<=5;n++) {
			  System.out.print("*");
			  }
			 System.out.println();
		}

}

}

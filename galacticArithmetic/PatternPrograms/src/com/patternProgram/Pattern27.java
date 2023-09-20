package com.patternProgram;

public class Pattern27 {
	public static void main(String[] args) {
		for(int k=1;k<=5;k++) {
			  for(int l=1;l<=5;l++) {
				if((k==1) || (k==5) || (l==1)|| (l==5)||(k==3&&l==3)||(k==2&&l==2)||(k==4&&l==4)) {
				System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			  }
			  
			  System.out.println();

		}
	}

}

package com.patternProgram;

public class Pattern29 {

	public static void main(String[] args) {
		for(int i=0;i<=11;i++) {
			  for(int j=0;j<=11;j++) {
				  if(i==11||j==11) {
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

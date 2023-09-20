package arrayJagged;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		String clr[][]=new String[3][];
		clr[0]=new String[2];
		clr[1]=new String[4];
		clr[2]=new String[3];
		for(int i=0;i<=clr.length-1;i++) {
		    for(int j=0;j<=clr[i].length-1;j++) {
		    	System.out.println("Enter the "+i+" box contain "+j+ " ball colour: ");
		    	clr[i][j]= scan.next();
		    }
		}
		System.out.println("COLOURS of Balls are...");
		for(int i=0;i<=clr.length-1;i++) {
		    for(int j=0;j<=clr[i].length-1;j++) {
		    	System.out.print(clr[i][j]+" | ");;
		    }
		    System.out.println();
		}
        scan.close();
	}

}

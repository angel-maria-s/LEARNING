package arrayExample3;

import java.util.Scanner;

public class Height {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		float m[]= new float[10];
		for(int i=0;i<=m.length-1;i++) {
			System.out.println("Enter heights of players: ");
			m[i]= scan.nextFloat();
		}
		System.out.println("The array contents are, ");
		for(int i=0;i<=m.length-1;i++) {
			System.out.print(m[i]+" ");
		}
        scan.close();


	}

}

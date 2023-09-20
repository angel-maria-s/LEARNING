package arrayExample3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int m[]= new int[5];
		for(int i=0;i<=m.length-1;i++) {
			System.out.println("Enter mark of students: ");
			m[i]= scan.nextInt();
		}
		System.out.println("The array contents are, ");
		for(int i=0;i<=m.length-1;i++) {
			System.out.print(m[i]+" ");
		}
        scan.close();
		
	}

}

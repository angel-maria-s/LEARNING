package arrayExample3;

import java.util.Scanner;

public class STRINGEX {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		String m[]= new String[8];
		for(int i=0;i<=m.length-1;i++) {
			System.out.println("Enter name of employees: ");
			m[i]= scan.nextLine();
		}
		System.out.println("The array contents are, ");
		for(int i=0;i<=m.length-1;i++) {
			System.out.print(m[i]+" ");
		}
        scan.close();


	}

}

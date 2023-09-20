package powerOfNum;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int base= scan.nextInt();
		int exp= scan.nextInt();
		System.out.println(PowerOfN.pown(base, exp));
		scan.close();
				

	}

}

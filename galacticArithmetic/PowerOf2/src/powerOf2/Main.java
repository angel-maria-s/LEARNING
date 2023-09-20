package powerOf2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int n=scan.nextInt();
		int res= Power2.pow2(n);
		System.out.println(res);
		scan.close();
	}

}

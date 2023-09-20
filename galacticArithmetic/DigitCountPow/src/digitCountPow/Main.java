package digitCountPow;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int base= scan.nextInt();
		int exp= DigitCountPower.count(base);
		int res=DigitCountPower.powerdigit(base,exp);
		System.out.println(res);
		scan.close();

	}

}

package NoDigitPow;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int base=scan.nextInt();
		int exp=scan.nextInt();
		int res=pow(base,exp);
		System.out.println(res);
		scan.close();

	}
		public static int pow(int base,int exp) {
		int count=0;
		while(count!=0) {
		int p=1;
		for(int i=0;i<exp;i++) {
			p=p*base;
		}
			exp=exp/10;
			count++;
	}
		}
}

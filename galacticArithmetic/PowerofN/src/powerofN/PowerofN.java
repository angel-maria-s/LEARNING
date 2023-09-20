package powerofN;

import java.util.Scanner;


public class PowerofN {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int base=scan.nextInt();
		int exp=scan.nextInt();
		powereroo(base,exp);
		scan.close();
	}
	public static void powereroo(int base,int exp) {
		int p=1;
		for(int i= 0;i<exp;i++){
			 p=p*base;
		}
		System.out.println(p);
	}

	

}

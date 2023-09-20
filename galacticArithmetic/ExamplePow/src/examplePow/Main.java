package examplePow;
import java.util.Scanner;
public class Main {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int base= scan.nextInt();
			int exp= scan.nextInt();
			int res= (int) Math.pow(base, exp);
			System.out.println("Result is "+res);
			scan.close();
		}

	}



package cubeofNumber;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
      Scanner scan= new Scanner(System.in);
      int n=scan.nextInt();
      Cube(n);
      scan.close();
      
	}
	public static void Cube(int n) {
		for(int i=1;i<=n;i++) {
			int cube=i*i*i;
			System.out.println("Number is : "+i+" and cube of "+i+ " is : "+cube);
		}
	}

}

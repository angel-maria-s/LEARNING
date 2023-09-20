package rightAngleTriangleNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
    int n=scan.nextInt();
    triangle(n);
    scan.close();
    
     }
    public static void triangle(int n) {
    	for(int i=0;i<=n;i++) {
    		for(int j=1;j<=i;j++) {
    			System.out.print(j);
    		}
    		System.out.println();
    	}
    }
}

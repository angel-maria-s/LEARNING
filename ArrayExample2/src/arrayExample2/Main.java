package arrayExample2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int arr[]= new int[3];
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("Enter an Element: ");
			arr[i]= scan.nextInt();
		}
		System.out.println("The array contents are, ");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
        scan.close();
	}

}

package arrayMethodForwardReverse;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int length= scan.nextInt();
		int arr[]=new int[length];
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]= scan.nextInt();
		}
		printArray(arr);
		scan.close();

	}
	public static void printArray(int arr[]) {
		System.out.println("Forward direction: ");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("reverse direction: ");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[arr.length-1-i]+" ");
		}

 
}
}
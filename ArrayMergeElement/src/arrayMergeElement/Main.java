package arrayMergeElement;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int arr[]=new int[scan.nextInt()];
		int arr2[]=new int[arr.length];
		System.out.println("Enter array 1 elements: ");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter array 2 elements: ");
		for(int i=0;i<=arr2.length-1;i++) {
			arr2[i]=scan.nextInt();
		}
		int arr3[]= new int[arr.length];
		for(int j=0;j<=arr.length-1;j++) {
			arr3[j]=arr[j]+arr2[j];	
		}
		System.out.println();
		System.out.println("2 Array contents are: ");
		for(int j=0;j<=arr.length-1;j++) {
			System.out.print(arr[j]+" ");
		}
		System.out.println();
		for(int j=0;j<=arr2.length-1;j++) {
			System.out.print(arr2[j]+" ");
		}
		System.out.println();
		System.out.println("Array SUM is...");
		for(int j=0;j<=arr3.length-1;j++) {
			System.out.print(arr3[j]+" ");
		}
		System.out.println();

scan.close();

	}

}

package arrayKpositionSwap;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int arr[]=new int[scan.nextInt()];
		int arr2[]= new int[arr.length];
		System.out.println("Enter array 1 elements: ");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("enter k position: ");
		int k=scan.nextInt();
		for(int i=0;i<=arr2.length-1;i++) {
		    k=arr[i];
			arr[i]=arr2[i];
			arr2[i]=k;
			
		}
		
		System.out.println("Array contents are: ");
		for(int j=0;j<=arr.length-1;j++) {
			System.out.print(arr[j]+" ");
		}
		System.out.println();
		System.out.println("swapped elements are: ");
		for(int j=0;j<=arr2.length-1;j++) {
			System.out.print(arr2[j]+" ");
		}
		System.out.println();

        scan.close();

	}

}

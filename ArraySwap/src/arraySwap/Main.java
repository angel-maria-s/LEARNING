package arraySwap;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int size= scan.nextInt();
		int arr1[]= new int[size];
		for(int i=0;i<=arr1.length-1;i++) {
			arr1[i]=scan.nextInt();
		}
		System.out.println("Before swapping");
		System.out.print("Arr--> ");
		for(int i=0;i<=arr1.length-1;i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		System.out.println("enter 2 index: ");
		int index1= scan.nextInt();
		int index2= scan.nextInt();
		if((index1>=0) && (index1<size) && (index2>=0 )&& (index2<size)){
			{
				int temp= arr1[index1];
				arr1[index1]=arr1[index2];
				arr1[index2]=temp;
				System.out.println("After swapping");
				System.out.print("Arr--> ");
				for(int i=0;i<=arr1.length-1;i++) {
					System.out.print(arr1[i]+" ");
				}
		}
			
		}
		

	}

}

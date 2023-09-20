package linearSearch;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter length of array: ");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter array elements: ");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("founding key...");
		System.out.println("enter key: ");
		int key= scan.nextInt();
		for(int i=0;i<=arr.length-1;i++) {
			if(key==arr[i]) {
				System.out.println("the key is found at "+i+"th index");
				return;
			}
		}
		System.out.println("key is not found");
        
		scan.close();
	}

}

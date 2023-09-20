package binarySearch;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array length: ");
		int arr[]= new int[scan.nextInt()];
		System.out.println("Enter array elements: ");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();	
			}
		System.out.println("Enter key: ");
		int key= scan.nextInt();
		int low=0;
		int high= arr.length-1;
		int mid= (low+high)/2;
		
		while(low<=high) {
		if(key==arr[mid]) {
			System.out.println("key found at "+mid+" position");
			return;
		}
		else if(key>arr[mid]){
			low=mid+1;
		}
		else {
			high=mid-1;
		}
		}
		if(low>high) {
			System.out.println("key not found in array");
	}
     scan.close();
     }
	}

package arrayMinMax;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int arr[] =new int[5];
		for(int j=0;j<=arr.length-1;j++){
			System.out.println("Enter the element: ");
			arr[j]=scan.nextInt();
		}
		int max = arr[0];
		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {
		    if (arr[i] > max) {
		        max = arr[i];
		        
		    }
		    if (arr[i] < min) {
		        min = arr[i];
		        

		    }
		}
		System.out.println("Max: "+max);
		System.out.println("Min: "+min);
        scan.close();
	}

}

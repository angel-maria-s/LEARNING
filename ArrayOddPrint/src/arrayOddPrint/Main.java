package arrayOddPrint;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int arr[]=new int[scan.nextInt()];
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("odd no.s: ");
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]%2!=0) {
				System.out.print(arr[i]+" ");
			}
			
		}

       scan.close();

	}

}

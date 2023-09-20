package kodnestPractise;
import java.util.Scanner;
public class FactorialLoop {

	public static void main(String[] args) {
         Scanner scan= new Scanner(System.in);
         System.out.println("enter a num: ");
         int n= scan.nextInt();
         System.out.println(factprint(n));
         scan.close();
	}
	public static int factprint(int n) {
		int res=1;
		for(int i=2;i<=n;i++)
			res= res * i;
		return res;
       	 
        
	}

}

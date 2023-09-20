package reverseNumber;
import java.util.Scanner;
public class ReverseNumber {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the no. which has to be reversed: ");
        int num= scan.nextInt();
        int temp=num;
        int reverse=0;
        int remainder=0;
        while(temp>0){
        	remainder= temp%10;
        	reverse= reverse*10+remainder;
        	temp/=10;	
        	        }
        System.out.println("reversed no: "+reverse);
        scan.close();
	}

}

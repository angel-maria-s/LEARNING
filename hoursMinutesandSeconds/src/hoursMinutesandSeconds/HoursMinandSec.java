package hoursMinutesandSeconds;
import java.util.Scanner;
public class HoursMinandSec {
      public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter Seconds:" );
		int Sec= scan.nextInt();
		int hours=Sec/3600;
		System.out.println("Hours: "+hours);
		Sec=Sec%3600;
		int min=Sec/60;
		System.out.println("Minutes: "+min);
		Sec=Sec%60;
		System.out.println("Seconds: "+Sec);
		scan.close();
	}
}

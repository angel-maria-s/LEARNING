package temperatureConversion;

import java.util.Scanner;

public class WeatherApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the Temperature Conversion Tool!");
		System.out.println("Select an option:\r\n"
				+ "\r\n"
				+ "1. Convert Celsius to Fahrenheit\r\n"
				+ "\r\n"
				+ "2. Convert Fahrenheit to Celsius");
		System.out.println("Enter your choice: ");
		int num= scan.nextInt();
		switch(num) {
		case 1:
			System.out.println("Enter the temperature in celsius: ");
			double celsius= scan.nextDouble();
			double res=celsiusToFahrenheit(celsius);
			System.out.println(celsius+"°C is equivalent to "+res+"°F");
			break;
		case 2:
			System.out.println("Enter the temperature in fahrenheit: ");
			double fahrenheit = scan.nextDouble();
			double res1=fahrenheitToCelsius(fahrenheit);
			System.out.println(fahrenheit+"°F is equivalent to "+res1+"°C");
			break;
		default:
			System.out.println("check your entries!!!");
			break;
		}
		scan.close();
	}
	 public static double celsiusToFahrenheit(double celsius) {
		
		return (celsius * 9/5) + 32;
	}
	 public static double fahrenheitToCelsius(double fahrenheit) {
		
		return (fahrenheit- 32)*5/9;
	}	

}

package theTemperatureConverter;
import java.util.Scanner;
public class convert {

	public static void main(String[] args) {
       Scanner scan= new Scanner(System.in);
       System.out.println("Enter fahrenhit temp: ");
       double fahrenheit= scan.nextDouble();
       TemperatureConverter temperatureConverter = new  TemperatureConverter();
       double celsius= temperatureConverter.convertFahrenheitToCelsius(fahrenheit);
       System.out.println(celsius);
       scan.close();
	}

}

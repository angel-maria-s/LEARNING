package theCalculatorDilemma;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
    Scanner scan= new Scanner(System.in);
    System.out.println("Calculate operations- 1.Addition, 2.Subtraction, 3.Multiplication, 4.Division");
    int num= scan.nextInt();
    System.out.println("Enter two numbers");
    double num1= scan.nextDouble();
    double num2= scan.nextDouble();
    PerformCalculator(num1,num2,num);
    scan.close();
	}
	public static void PerformCalculator(double num1,double num2, int num) {
		switch(num) {
		case 1:
			System.out.println(num1+num2);
			break;
		case 2:
			System.out.println(num2-num1);
			break;
		case 3:
			System.out.println(num1*num2);
			break;
		case 4:
			System.out.println(num2/num1);
			break;
		default:
			System.out.println("Check your entries properly!!!");
			break;
		}
	}

}

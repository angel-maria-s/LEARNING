package kodnestPractise;
import java.util.Scanner;
public class GradeAnalyser {

	public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter your mark: ");
       int score= scan.nextInt();
       ScoreAnalyser s1= new ScoreAnalyser();
       s1.printGrade(score);
       scan.close();
       
	}

}

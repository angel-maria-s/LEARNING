package pigLatinWord;

import java.util.Scanner;

public class PigLatinWord {
      public static void main(String[] args) {
    	Scanner scan= new Scanner(System.in); 
		System.out.println("English Word: ");
		String ch=scan.next();
		System.out.println("PigLatin Word: "+ch.substring(1)+ch.charAt(0)+"ay");
		scan.close();
	}
}

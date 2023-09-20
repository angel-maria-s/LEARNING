package kodnestPractise;

public class LabelledWhile {

	public static void main(String[] args) {
		System.out.println("ROBO....");
        int i=1; 
		rajini:while(i<=5) {
			int j=1;
        	 while(j<=5) {
        		 System.out.print("* ");
        		 j++;
        		 break rajini;
        	 }
        	 System.out.println();
        	 i++;
         }
	}

}

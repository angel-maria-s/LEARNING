package kodnestPractise;

public class DoWhilelabeleg1 {

	public static void main(String[] args) {
		System.out.println("start..");
        int i=1; 
		angel:do{
			 int j=1;
			riya: do {
        		 System.out.print("* ");
        		 j++;
        		 break riya;
        	 }while(j<=5);
          System.out.println();
          break angel;
         }while(i<=5);	 
	}
}

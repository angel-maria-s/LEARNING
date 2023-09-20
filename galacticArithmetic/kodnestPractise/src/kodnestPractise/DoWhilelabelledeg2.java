package kodnestPractise;

public class DoWhilelabelledeg2 {

	public static void main(String[] args) {
		System.out.println("start..");
        int i=1; 
		first:do{
			System.out.print("FIRST");
			System.out.println();
			int j=1;
			do {
				System.out.println("@ ");
				j++;
				
			}while(j<5);
			break first;
		}while(true);
	}

}

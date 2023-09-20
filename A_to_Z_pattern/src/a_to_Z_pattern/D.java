package a_to_Z_pattern;

public class D {
	public static void main(String[] args) {
		for(int k=1;k<=11;k++) {
			  for(int l=1;l<=11;l++) {
				if(k==1 || k==11 || l==1|| l==11 ) {
				System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			  }
			  
			  System.out.println();

		}
	}
}

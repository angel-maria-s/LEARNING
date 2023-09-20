package a_to_Z_pattern;

public class S {

	public static void main(String[] args) {
		int n=10;
		for(int k=1;k<=n;k++) {
			  for(int l=1;l<=n;l++) {
				if(k==1|| k==n || (l==1&&k<=n/2)|| (l==n&&k>=n/2)||k==n/2 ) {
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

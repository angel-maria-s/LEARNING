package a_to_Z_pattern;

public class X {

	public static void main(String[] args) {
		int n=11;
		for(int i=0;i<=n;i++) {
			  for(int j=0;j<=n;j++) {
				  if(i==j||j==n-i) {
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

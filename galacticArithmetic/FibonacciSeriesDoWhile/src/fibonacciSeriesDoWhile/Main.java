package fibonacciSeriesDoWhile;

public class Main {

	public static void main(String[] args) {
		int n=100;
		int f=0;
		int s=1;
		do {
			int t=f+s;
			System.out.print(f+"");
			f=s;
			s=t;
		}while(f<n);

	}

}

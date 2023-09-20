package evenPrint1to50;

public class Main {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=50;i++) {
			if(i%2==0) {
				sum+=i;
			}
			else {
				continue;
			}
		}
		System.out.println(sum);

	}

}

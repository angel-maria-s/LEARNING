package randomRange;

public class Main {

	public static void main(String[] args) {
		int min=1;
		int max=100;
		int result= min+(int) (Math.random()* (max-min+1));
        System.out.println("Random No. within the range 1 to 100 is "+result);
	}

}

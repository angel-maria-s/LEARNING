package randomNumber;
import java.util.Random;

public class Main {
	    public static void main(String[] args) {
	        Random random = new Random();

	        // Generating random integers
	        int randomInt = random.nextInt(); // Generates an integer in the full range of int
	        int boundedRandomInt = random.nextInt(100); // Generates an integer between 0 (inclusive) and 100 (exclusive)

	        // Generating random doubles
	        double randomDouble = random.nextDouble(); // Generates a double between 0.0 (inclusive) and 1.0 (exclusive)

	        // Generating random booleans
	        boolean randomBoolean = random.nextBoolean(); // Generates a random true or false
	        System.out.println("Random Integers: "+randomInt);
	        System.out.println("Random Integer between 0 and 100: "+boundedRandomInt);
	        System.out.println("Random double value between 0.0 and 1.0: "+randomDouble);
	        System.out.println("Random true or false: "+randomBoolean);

	    }
	}



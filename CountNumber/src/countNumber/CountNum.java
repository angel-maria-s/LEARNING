package countNumber;

public class CountNum {
       public static int CountN(int n) {
	       int count=0;
           while(n!=0) {
        	   n=n/10;
        	   count++;
           }
           return count;
       }
}

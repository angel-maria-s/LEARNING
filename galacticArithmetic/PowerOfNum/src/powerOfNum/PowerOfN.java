package powerOfNum;

public class PowerOfN {
      public static int pown(int base, int exp) {
    	  int res=1;
    	  for(int i=0;i<exp;i++) {
    		  res=res*base;
    	  }
    	  return res;
      }
}

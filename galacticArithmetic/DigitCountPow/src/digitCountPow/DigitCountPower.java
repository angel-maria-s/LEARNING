package digitCountPow;

public class DigitCountPower {
        public static int powerdigit(int base, int exp) {
        	    int res=1;
        		for(int i=0;i<exp;i++){
        			res=res*base;
        		}
        	return res;
        }
        public static int count(int base) {
             int count=0;
             while(base!=0) {
            	 base=base/10;
            	 count++;
             }
             return count;
        }
}

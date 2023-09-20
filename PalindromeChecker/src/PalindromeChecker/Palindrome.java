package PalindromeChecker;

public class Palindrome {
	public void Palindromeofn(int n) {
    	int rem=0;
    	int rev=0;
    	int orginal=n;
    	while(n>0){
    		rem=n%10;
    		rev=(rev*10)+rem;
    		n/=10;
    		}
    	if(orginal==rev) {
    		System.out.println(true);
    	}
    	else {
    		System.out.println(false);
    	}
    	

    }

}

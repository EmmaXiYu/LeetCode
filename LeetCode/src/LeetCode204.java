
public class LeetCode204 {
	/*
	 * brute-force: Time limit exceeded
	 */
	  public static int countPrimes(int n) {
	       
	       if(n==0) return 0;
	       else if (n==1) return 0;
	       else if (n==2) return 0;
	       else if (n==3) return 1;
	       else {
	    	   
	    	   int primeNum=2;
	    	   boolean ifPrime=true;
	    	   for(int j=n-1;j>3;j--){
	    	   for(int i=2;i<=j/2;i++)
	    	   {
	    		   if(j%i==0){
	    			   ifPrime=false;
	    			   break;
	    		   }
	    	   }
	    	   if(ifPrime)
	    		   {primeNum+=1;}
	    	   ifPrime=true;
	    	   }
	    	   return primeNum;	       
	    	   }
 	    }
	public static void main(String[] args) {
		System.out.println(countPrimes(10000));

	}

}

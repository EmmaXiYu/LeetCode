
public class LeetCode172 {
	   public static int trailingZeroes(int n) {
		   
		   int factorial=1;
		   int counter=0;
	        for(int i=1;i<=n;i++)
	        {
	        	factorial*=i;
	        	String facString=Integer.toString(factorial);
	        	int lastNumber=Integer.parseInt(facString.substring(facString.length()-1, facString.length()));
	            System.out.println(factorial);
	        	if(lastNumber==0)
	            	counter++;
	        }
	        return counter;
	    }
	public static void main(String[] args) {
	   trailingZeroes(100);

	}

}

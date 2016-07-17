
public class LeetCode374 {
	  public int guessNumber(int n) {
	        return guess_number(1, n);
	    }
	    public int guess_number(int low, int high)
	    {
	        int mid=low+(high-low)/2;
	        int result=guess(mid);
	        if(result==-1)
	        return guess_number(low, mid-1);
	        else if(result==1)
	         return guess_number(mid+1, high);
	         else 
	         return mid;
	    }
	    /*
	     * The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num);
	     */
	    public int guess(int n)
	    {
	    	return n;
	    }
}

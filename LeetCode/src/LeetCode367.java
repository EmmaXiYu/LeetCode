
public class LeetCode367 {
	/*
	 * Has to consider integer multiplication overflow problem
	 */
	 public boolean isPerfectSquare(int num) {
		 
	      return  find_perfect_square( (long)num, (long)1, (long)num) ;
	    }
	    
	    public boolean find_perfect_square(long num, long low, long high)
	    {
	        if(low>high)return false;
	        long mid=low+(high-low)/2;
	        if(mid*mid>Integer.MAX_VALUE)return find_perfect_square( num, low, mid-1);
	        if(mid*mid==num) return true;
	        else if(mid*mid<num)
	        return find_perfect_square( num, mid+1, high);
	        else 
	        return find_perfect_square( num, low, mid-1);
	    }
	public static void main(String[] args) {
		LeetCode367 obj=new LeetCode367();
		System.out.print(obj.isPerfectSquare(808201));

	}

}

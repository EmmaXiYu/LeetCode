
public class LeetCode191 {
	 public int hammingWeight(int n) {
		 int sum=0;
		 while(n!=0)
		 {
			 if((n&1)==1)
				 sum++;
			 n=n>>>1;
		 }
	        return sum;
	    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

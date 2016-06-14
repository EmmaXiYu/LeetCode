
public class LeetCode198 {
	 public static int rob(int[] nums) {
	        if(nums==null||nums.length==0)
	        return 0;
	        else if (nums.length==1) return nums[0];
	        else if (nums.length==2) return Math.max(nums[0], nums[1]);
	        else {
	            
	            int [] dp=new int[nums.length];
	            dp[0]=nums[0];
	            dp[1]=Math.max(nums[0],nums[1]);
	            for(int i=2;i<nums.length;i++)
	            {
	                dp[i]=Math.max(nums[i]+dp[i-2],dp[i-1]);
	            }
	            return dp[nums.length-1];
	        }
	        
	    }
	 public static void main(String[] args)
	 {
		 int [] n={0,10,3,3,0,5,4,2,7,9,10};
		 System.out.println(rob(n));
	 }

}

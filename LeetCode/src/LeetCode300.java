import java.util.ArrayList;
import java.util.List;

public class LeetCode300 {

	/*
	 * O(n2) complexity.
	 */
	public int lengthOfLIS(int[] nums) {
	     if(nums==null||nums.length==0) return 0;
	       int [] dp=new int[nums.length];
	       dp[0]=1;
	       int returnMax=1;
	       for(int i=1;i<nums.length;i++)
	       {
	           int max=1;
	           for(int j=i-1;j>=0;j--)
	           {
	               if(nums[j]<nums[i])
	               max=Math.max(max,dp[j]+1);
	               
	           }
	           dp[i]=max;
	           returnMax=Math.max(returnMax, max);
	       }
	       return returnMax;
	    }
	
	public static void main(String[] args) {
		
		LeetCode300 obj=new LeetCode300();
		int [] list={10, 9, 2, 5, 3, 7, 101, 18};
		System.out.println(obj.lengthOfLIS(list));
	}

}


public class LeetCode238 {
	  public int[] productExceptSelf(int[] nums) {
	        
	        int [] res=new int[nums.length];
	        res[0]=1;
	        for(int i=0;i<nums.length-1;i++)
	        {
	            res[i+1]=res[i]*nums[i];
	        }
	        
	        int right=nums[nums.length-1];
	        for(int i=nums.length-2;i>=0;i--)
	        {
	            res[i]*=right;
	            right*=nums[i];
	        }
	        return res;
	    }
}

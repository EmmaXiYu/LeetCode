import java.util.Arrays;

public class LeetCode377 {
	 public int combinationSum4(int[] nums, int target) {
	        Arrays.sort(nums);
	        if(nums==null||nums.length==0) return 0;
	        int [][] dp=new int[target][nums.length];
	        int [] result=new int[target]; 
	        for (int i=0;i<target;i++)
	        {
	            int sum=0;
	           for(int j=0;j<nums.length;j++)
	           {
	               if((i+1)<nums[j])
	               dp[i][j]=0;
	               else if((i+1)==nums[j])
	               {
	                   dp[i][j]=1;
	                   sum+=1;
	               }
	               else 
	               {
	                       dp[i][j]=result[i+1-nums[j]-1];
	                   
	                 sum+=dp[i][j];
	                   
	               }
	               
	           }
	           result[i]=sum;
	        }
	       
	        return result[target-1];
	    }
	public static void main(String[] args) {
		LeetCode377 obj=new LeetCode377();
		int [] l={1,2,3};
		System.out.println(obj.combinationSum4(l, 4));

	}

}

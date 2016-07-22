
public class LeetCode376 {
	  public int wiggleMaxLength(int[] nums) {
	        if(nums==null||nums.length==0) return 0;
	        if(nums.length==1) return 1;
	        int [] dp=new int[nums.length];
	        dp[0]=1;
	        if(nums[1]==nums[0])
	        dp[1]=1;
	        else dp[1]=2;
	        int lastPositive=-1;
	        int lastNegative=-1;
	        int lastIndicator=0;// p:0;N:1
	        if(nums[1]-nums[0]>0)
	         lastPositive=1;
	         else {
	             lastNegative=1;
	             lastIndicator=1;
	         }
	        
	         for(int i=2;i<nums.length;i++)
	         {
	             if(lastIndicator==0&&nums[i]-nums[i-1]>0)
	             {
	                 lastPositive=i;
	                 lastIndicator=0;
	                 if(lastNegative==-1)
	                     dp[i]=2;
	               
	                 else dp[i]=dp[lastNegative]+1;
	                     
	                 
	             }
	             else if(lastIndicator==1&&nums[i]-nums[i-1]>0)
	             {
	                 dp[i]=dp[i-1]+1;
	                 lastPositive=i;
	                 
	                 lastIndicator=0;
	             }
	             else if(lastIndicator==0&&nums[i]-nums[i-1]<0)
	             {
	                 dp[i]=dp[i-1]+1;
	                 lastNegative=i;
	                 lastIndicator=1;
	             }
	             else if(lastIndicator==1&&nums[i]-nums[i-1]<0)
	             {
	                    lastNegative=i;
	                    lastIndicator=1;
	                    if(lastPositive==-1)
	                       dp[i]=2; 
	                   else  dp[i]=dp[lastPositive]+1;
	             }
	             else if(nums[i]-nums[i-1]==0)
	                 dp[i]=dp[i-1];
	                 
	             
	         }
	         return dp[nums.length-1];
	    }
	 public static void main(String[] args)
	 {   
		 LeetCode376 obj=new LeetCode376();
		 int [] l={1,17,5,10,13,15,10,5,16,8};
		 System.out.println(obj.wiggleMaxLength(l));
	 }
}

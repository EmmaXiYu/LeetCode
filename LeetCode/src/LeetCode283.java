
public class LeetCode283 {

	 public void moveZeroes(int[] nums) {
	        int endPosition=nums.length;
	        int checkPoint=0;
	        while(checkPoint<endPosition)
	        {
	             if(nums[checkPoint]==0){
	            for(int j=checkPoint;j<endPosition-1;j++)
	            {
	                nums[j]=nums[j+1];
	            }
	            nums[endPosition-1]=0;
	            endPosition-=1;
	                 
	             }
	            else checkPoint++;
	        }
	       
	    }
}

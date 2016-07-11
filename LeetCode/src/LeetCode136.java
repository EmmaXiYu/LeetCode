import java.util.Arrays;

public class LeetCode136 {
	 public int singleNumber(int[] nums) {
	        if(nums.length==1) return nums[0];
	        Arrays.sort(nums);
	         int num=0;
	        if(nums.length%2==0)
	        num=nums.length-1;
	        else num=nums.length-2;
	        for(int i=0;i<num;i+=2)
	        {
	            if(nums[i]!=nums[i+1])
	            return nums[i];
	        }
	        if(nums.length%2!=0)
	        return nums[nums.length-1];
	        return -1;
	    }
}

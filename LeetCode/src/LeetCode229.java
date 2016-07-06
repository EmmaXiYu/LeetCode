import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode229 {

	public List<Integer> majorityElement(int[] nums) {
		  
	       if(nums==null|| nums.length==0) return new ArrayList<>();
	         List<Integer> returnList=new ArrayList<>();
	        Arrays.sort(nums);
	        boolean found=false;
	        int counter=1;
	        if(nums.length==1) returnList.add(nums[0]);
	        else if(counter>nums.length/3&&nums[1]!=nums[0]) returnList.add(nums[0]);
	        for(int i=1;i<nums.length;i++)
	        {
	        	if(nums[i]==nums[i-1]&&!found)
	        	{
	        		counter++;
	        		if(counter>nums.length/3)
	        			{
	        			returnList.add(nums[i]);
	        			found=true;
	        			}
	        			
	        			
	        	}
	        	else if(nums[i]!=nums[i-1])
	        	{
	        		counter=1;
	        		found=false;
	        		if(counter>nums.length/3)
	        			{
	        			returnList.add(nums[i]);
	        			found=true;
	        			}
	        			
	        		
	        	}}
	        	
	        	return returnList;
	       
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

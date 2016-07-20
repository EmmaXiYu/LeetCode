
public class LeetCode153 {
	  public int findMin(int[] nums) {
	       return find_min(nums,0,nums.length-1);
	    }
	    
	    public int find_min(int [] nums,int low, int high)
	    {
	        if(low>=high) return nums[low];
	        int mid=low+(high-low)/2;
	        if(mid==0)
	        return Math.min(nums[mid],nums[mid+1]);
	        if(mid==nums.length-1)
	         return Math.min(nums[mid],nums[mid-1]);
	        if(nums[mid-1]>nums[mid]&&nums[mid+1]>nums[mid])
	        return nums[mid];
	        if(nums[mid-1]<nums[mid]&&nums[mid+1]<nums[mid])
	        return nums[mid+1];
	        else 
	        return Math.min(find_min(nums,low,mid-1),find_min(nums,mid+1,high));
	    }
}

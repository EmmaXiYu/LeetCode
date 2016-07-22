
public class LeetCode162 {
	  public int findPeakElement(int[] nums) {
	       
	        return find_peak_element( nums, 0, nums.length-1);
	    }
	    public int find_peak_element(int [] nums, int low, int high)
	    {
	        if(low>=high) return low;
	        int mid =low+(high-low);
	        if(mid==0&&nums[mid+1]<nums[mid]) return mid;
	        if(mid==nums.length-1&&nums[mid-1]<nums[mid]) return mid;
	        if(nums[mid-1]<nums[mid]&&nums[mid+1]<nums[mid]) return mid;
	        else if(nums[mid-1]>nums[mid])
	        return find_peak_element( nums,  low,  mid-1);
	        else return find_peak_element( nums, mid+1, high);
	    }
}



public class LeetCode35 {
	/*
	 * Binary search method.
	 */
	 public int searchInsert(int[] nums, int target) {
	        if(nums==null||nums.length==0) return 0;
	          return  binarySearch(nums,  target, 0, nums.length-1);
	    }
	    public int binarySearch(int [] nums, int target, int low, int high)
	    {
	        if(high<0)return 0;
	        if(low>high) return low;
	        int mid=low+(high-low)/2;
	        if(nums[mid]==target) return mid;
	        if(nums[mid]<target)
	        return  binarySearch(nums,  target, mid+1, high);

	         return  binarySearch(nums,  target,low, mid-1);
	    }
	    
//	  public int searchInsert(int[] nums, int target) {
//	        if(nums==null||nums.length==0)
//	        return 0;
//	      
//	        for(int i=0;i<nums.length;i++)
//	        {
//	            if(nums[i]==target)
//	            return i;
//	            if(nums[i]>target)
//	            return i;
//	          
//	            
//	        }
//	        return nums.length;
//	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

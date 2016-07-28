
public class LeetCode81 {
	 public boolean search(int[] nums, int target) {
	        return binarySearch(nums, target, 0, nums.length-1);
	      
	    }
	     public boolean binarySearch(int [] nums, int target, int low, int high)
	    
	    {
	        if(low>high) return false;
	       if(nums[low]==target) return true;
	       if(nums[high]==target) return true;
	       int mid=low+(high-low)/2;
	       if(nums[mid]==target) return true;
	       if(mid==0)
	       {
	           if(high==0)return false;
	           
	           else if(target!=nums[mid+1]) return false;
	           else return true;
	           
	       }
	    
	       if((nums[mid-1]>nums[mid]&&nums[mid+1]>nums[mid])||(nums[mid-1]<nums[mid]&&nums[mid+1]<nums[mid]))
	       {
	           if(nums[low]<target)
	           return binarySearch(nums, target, low+1, mid-1);
	           else if(nums[low]>target)
	            return binarySearch(nums, target,mid+1, high-1);
	       }
	       else 
	       {
	           boolean leftHalf=binarySearch(nums, target, low+1, mid-1);
	           if(leftHalf) return true;
	           else 
	           
	              return  binarySearch(nums, target,mid+1, high-1);
	           
	       }
	       return false;
	    }
}

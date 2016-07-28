
public class LeetCode33 {
	/*
	 * Faster
	 */
	 public int search(int[] nums, int target) {
	     
         return binarySearch(nums, target, 0, nums.length-1);
    }
    
    public int binarySearch(int [] nums, int target, int low, int high)
    
    {
        if(low>high) return -1;
       if(nums[low]==target) return low;
       if(nums[high]==target) return high;
       int mid=low+(high-low)/2;
       if(nums[mid]==target) return mid;
       if(mid==0)
       {
           if(high==0)return -1;
           
           else if(target!=nums[mid+1]) return -1;
           else return mid+1;
           
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
           int leftHalf=binarySearch(nums, target, low+1, mid-1);
           if(leftHalf!=-1) return leftHalf;
           else 
           
              return  binarySearch(nums, target,mid+1, high-1);
           
       }
       return -1;
    }
//	public int search(int[] nums, int target) {
//        return binarySearch(nums, target, 0, nums.length-1);
//   }
//   
//   public int binarySearch(int [] nums, int target, int low, int high)
//   
//   {
//       if(high<=low) 
//       {
//           if(nums[low]==target) return low;
//           else return -1;
//       }
//       int mid=low+(high-low)/2;
//       if(nums[mid]==target) return mid;
//       if(mid==nums.length-1)
//       {int f= binarySearch(nums,target,mid-1, mid-1);
//       int s= binarySearch(nums,target,mid, mid);
//       if(f==-1&s==-1)
//       return -1;
//       else if(f!=-1)return f;
//       else return s;
//       }
//          if(mid==0)
//       { int f =binarySearch(nums,target,0, 0);
//       int s= binarySearch(nums,target,mid+1, mid+1);
//        if(f==-1&s==-1)
//       return -1;
//       else if(f!=-1)return f;
//       else return s;
//       }
//       if((nums[mid-1]<nums[mid]&&nums[mid+1]<nums[mid])||(nums[mid-1]>nums[mid]&&nums[mid+1]>nums[mid]))
//       {
//           if(target>=nums[mid+1]&&target<=nums[high])
//            return  binarySearch(nums,target,mid+1, high);
//           else if(target>=nums[low]&&target<=nums[mid-1])
//           return  binarySearch(nums,target,low, mid-1);
//           
//       }
//         else {
//           int lowHalf=binarySearch(nums,target,low, mid-1);
//           int highHalf=binarySearch(nums,target,mid+1, high);
//           if(lowHalf==-1&&highHalf==-1) return -1;
//           else if(lowHalf!=-1) return lowHalf;
//           else return highHalf;
//         }
//         return -1;
//   }
}

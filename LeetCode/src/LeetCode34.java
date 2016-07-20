
public class LeetCode34 {
	public int[] searchRange(int[] nums, int target) {
	       int[] arrayList=new int [2];
	       arrayList[0]=-1;
	       arrayList[1]=-1;
	        binary_search( nums,  target,0, nums.length-1,  arrayList);
	        return arrayList;
	    }
	    
	    public void binary_search(int [] nums, int target, int low , int high, int [] arrayList)
	    {
	        if(low>high) return ;
	        int mid=low+(high-low)/2;
	        if(nums[mid]==target)
	        {
	            if(arrayList[0]==-1) arrayList[0]=mid;
	             if(arrayList[1]==-1) arrayList[1]=mid;
	               if(mid<=arrayList[0])  arrayList[0]=mid;
	             if(mid>=arrayList[1])arrayList[1]=mid;
	            if((mid+1)<=high&&(mid+1)<=nums.length-1&&nums[mid+1]==target)
	             binary_search( nums,  target, mid+1, high,  arrayList);
	           if ((mid-1)>=low&&(mid-1)>=0&&nums[mid-1]==target)
	             binary_search( nums,  target, low, mid-1,  arrayList);
	           
	            
	            
	        }
	        if(nums[mid]>target)
	         binary_search( nums,  target,  low ,  mid-1,  arrayList);
	        if(nums[mid]<target)
	        binary_search( nums,  target,  mid+1 ,  high,  arrayList);
	    }
	public static void main(String[] args) {
		

	}

}

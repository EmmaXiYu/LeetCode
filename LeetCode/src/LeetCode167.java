
public class LeetCode167 {
	  public int[] twoSum(int[] numbers, int target) {
	        
	        for(int i=0;i<numbers.length;i++)
	        {
	            int returnV=find_the_second(numbers,  target-numbers[i],  i+1,  numbers.length-1);
	            if(returnV !=-1)
	            {
	                int [] list=new int[2];
	                list[0]=i+1;
	                list[1]=returnV+1;
	                return list;
	            }
	        }
	        return null;
	    }
	    
	    
	    public int find_the_second(int[] nums, int target, int low, int high)
	    {
	        if(low>high) return -1;
	        int mid=low+(high-low)/2;
	        if(nums[mid] == target)
	            return mid;
	        else if(nums[mid] > target)
	         return find_the_second(nums, target, low, mid-1);
	         else 
	         return  find_the_second( nums,  target, mid+1, high);
	         
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

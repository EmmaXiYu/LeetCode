import java.util.Arrays;

public class LeetCode80 {
	 public int removeDuplicates(int[] nums) {
	        if(nums==null||nums.length==0)return 0;
	        Arrays.sort(nums);
	        int currentNum=nums[0];
	        int counter=1;
	        int returnLength=nums.length;
	        for(int i=1;i<returnLength;i++)
	        {
	            if(nums[i]==currentNum&&counter==1)
	            {
	                counter++;
	            }
	            else if(nums[i]==currentNum&&counter==2)
	            {
	                for(int j=i+1;j<nums.length;j++)
	                {
	                    nums[j-1]=nums[j];
	                }
	                returnLength--;
	                i--;
	             
	            }
	            else if(nums[i]!=currentNum)
	            {
	                currentNum=nums[i];
	                counter=1;
	            }
	        }
	        return returnLength;
	    }
	public static void main(String[] args) {
		LeetCode80 lc=new LeetCode80();
		
		int [] i={1,1,1};
		System.out.println(lc.removeDuplicates(i));
		

	}

}

import java.util.ArrayList;
import java.util.List;

public class LeetCode300 {

	 public int lengthOfLIS(int[] nums) {
	        
	        int max=0;
	        for(int i=0;i<nums.length;i++)
	        {
	            int num=nums[i];
	            int counter=1;
	            for(int j=i+1;j<nums.length;j++)
	            {
	                if(nums[j]>num)
	                {
	                    num=nums[j];
	                    counter++;
	                }
	            }
	            max=Math.max(max,counter);
	        }
	        return max;
	    }
	public static void main(String[] args) {
		
		LeetCode300 obj=new LeetCode300();
		int [] list={10, 9, 2, 5, 3, 7, 101, 18};
		System.out.println(obj.lengthOfLIS(list));
	}

}

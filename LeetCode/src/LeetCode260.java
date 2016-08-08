import java.util.Arrays;

public class LeetCode260 {
	 public int[] singleNumber(int[] nums) {
		 int [] single=new int [2];
		 if(nums==null||nums.length==0) return single;
		 if(nums.length==1){
			 single[0]=nums[0];
			 return single;
		 }
	        Arrays.sort(nums);
	        int counter=0;
	        int i=0;
	        while(counter<2&&i<nums.length-1)
	        {
	        	if(nums[i]==nums[i+1])
	        		i=i+2;
	        	else {single[counter]=nums[i];
	        	counter++;
	        	i++;}
	        }
	        if(i==nums.length-1)single[counter]=nums[i];
	        return single;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

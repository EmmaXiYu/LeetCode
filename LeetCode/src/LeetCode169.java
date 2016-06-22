import java.util.HashMap;

public class LeetCode169 {

	 public static  int majorityElement(int[] nums) {
	       HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
	       int majority=0;
		 for(int i=0; i<nums.length;i++)
		 {
			 if(hm.containsKey(nums[i]))
			 {
				 int counter=hm.get(nums[i]);
				 hm.put(nums[i], ++counter);
				 if(counter>nums.length/2)
					 return nums[i];
			 }
			 else 
				 {if(i==nums.length-1 && nums.length==1){
					 return nums[i];
				 }
				 hm.put(nums[i], 1);}
		 }
		return 0;
		 
	    }
	public static void main(String[] args) {
		int[] nums={8,8,7,7,7};
		System.out.println(majorityElement(nums));

	}

}

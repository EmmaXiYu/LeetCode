import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LeetCode219 {

	 public static boolean containsNearbyDuplicate(int[] nums, int k) {
		    if(nums==null||nums.length<2) return false;
		    else if(k<1) return false ;
		    else {
		    	HashMap<Integer, List<Integer>> hm=new HashMap<Integer, List<Integer>>();
		    	for(int i=0;i<nums.length;i++)
		    	{
		    		if(hm.containsKey(nums[i]))
		    		{
		    			List<Integer> l=hm.get(nums[i]);
		    			for(int j=0;j<l.size();j++)
		    			{
		    				int r=l.get(j)-i;
		    				if(Math.abs(l.get(j)-i)<=k)
		    					return true;
		    			}
		    			l.add(i);
		    			hm.put(nums[i], l);
		    		}
		    		else 
		    		{
		    			List<Integer> l=new ArrayList<>();
		    			l.add(i);
		    			hm.put(nums[i], l);
		    			}
		    	}
		    	
		    	return false;
		    }
		 
		 
	    }
	
	
	public static void main(String[] args) {
		int[] test={99,99};
		System.out.println(containsNearbyDuplicate(test,2));

	}

}

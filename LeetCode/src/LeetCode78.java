import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode78 {
	 public List<List<Integer>> subsets(int[] nums) {
	        Arrays.sort(nums);
	        List<List<Integer>> ll=new ArrayList<>();
	       List<Integer> tempList=new ArrayList<>();
	    backTracking (ll,  tempList,  nums, 0);
	    return ll;
	    }                                                                                                                                                                                                                   
	    public void backTracking (List<List<Integer>> ll, List<Integer> tempList, int[] nums, int index)
	    {
	        ll.add(new ArrayList<>(tempList));
	        for(int i=index;i<nums.length;i++)
	        {
	            tempList.add(nums[i]);
	            backTracking(ll, tempList,nums, i+1);
	            tempList.remove(tempList.size()-1);      
	        }
	    }
}

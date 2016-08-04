import java.util.ArrayList;
import java.util.List;

public class LeetCode209 {
	/*
	 * Time limit exceeded
	 */
//	 public int minSubArrayLen(int s, int[] nums) {
//	        if(nums==null) return 0;
//	        List<Integer> ll=new ArrayList<>();
//	        List<Integer> candidates=new ArrayList<>();
//	        for(int i=0;i<nums.length;i++)
//	        {
//	            candidates.add(nums[i]);
//	        }
//	        getLength( ll,0,candidates, 0,s);
//	        if(ll.size()==0) return 0;
//	        int min=ll.get(0);
//	        for(int i=1;i<ll.size();i++)
//	        {
//	            min=Math.min(min,ll.get(i));
//	        }
//	        return min;
//	    }
//	    
//	    public void getLength(List<Integer> lengthList, int length,List<Integer> candidates, int sum, int target)
//	    {
//	        if(sum>=target)
//	        {
//	             int l=length;
//	            lengthList.add(l);
//	            return;
//	        }
//	        List<Integer> c=new ArrayList<>(candidates);
//	        for(int i=0;i<c.size();i++)
//	        {
//	            sum+=c.get(i);
//	            int remove=c.get(i);
//	            c.remove(i);
//	            length++;
//	            getLength(lengthList, length,c, sum,target);
//	            length--;
//	            c.add(i,remove);
//	            sum-=remove;
//	        }
//	    }
//	    
	    public static void main(String[] args)
	    {
	    	LeetCode209 obj=new LeetCode209();
	    	int[] l={1,4,4,4};
	    	
	    //	System.out.println(obj.minSubArrayLen(4, l));
	    	
	    }
}

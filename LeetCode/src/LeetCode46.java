import java.util.ArrayList;
import java.util.List;

public class LeetCode46 {
	 public List<List<Integer>> permute(int[] nums) {
	        List<List<Integer>> ll=new ArrayList<>();
	        List<Integer> l=new ArrayList<>();
	        List<Integer> candidates=new ArrayList<>();
	        for(int i=0;i<nums.length;i++)
	        {
	            candidates.add(nums[i]);
	        }
	        make_permute(ll,  l, candidates,nums.length);
	        return ll;
	        
	    }
	    public void make_permute(List<List<Integer>> ll, List<Integer> l,List<Integer> candidates, int length)
	    {
	        if(l.size()==length)
	        {  
	        	 List<Integer> array=new ArrayList<>(l);//Very important 
	        	 ll.add(array);
	               return;
	        }
	        List<Integer> array=new ArrayList<>(l);
	        List<Integer> c=new ArrayList<>(candidates);
	        for(int i=0;i<candidates.size();i++)
	        {
	            array.add(c.get(i));
	            int remove=c.get(i);
	            c.remove(i);
	            make_permute( ll, array,  c,length);
	            c.add(i,remove);
	            array.remove(array.size()-1);
	        }
	    }
	    public static void main(String[] args)
	    {
	    	LeetCode46 obj=new LeetCode46();
	    	int [] l={1,2,3};
	    	obj.permute(l);
	    	
	    }
}

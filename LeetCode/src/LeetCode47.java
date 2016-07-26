import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode47 {
	/*
	 * Both of these two method work
	 */
	   public List<List<Integer>> permuteUnique(int[] nums) {
		      Arrays.sort(nums);
		        List<List<Integer>> ll=new ArrayList<>();
		        List<Integer> l=new ArrayList<>();
		        List<Integer> candidates=new ArrayList<>();
		        for(int i=0;i<nums.length;i++)
		            candidates.add(nums[i]);
		        permute_Unique( ll, l, nums.length, candidates);
		        return ll;
		        
		        
		    }
		    public void permute_Unique(List<List<Integer>> ll,  List<Integer> l, int length, List<Integer> candidates)
		    {
		        if(l.size()==length)
		        {
		            List<Integer> newList=new ArrayList<>(l);
		            ll.add(newList);
		            return;
		        }
		        List<Integer> newList=new ArrayList<>(l);
		        List<Integer> c=new ArrayList<>(candidates);
		        for(int i=0;i<candidates.size();i++)
		        {
		            if(i>=1&&c.get(i)==c.get(i-1))
		            continue;
		            int remove=c.get(i);
		            newList.add(c.get(i));
		            c.remove(i);
		            permute_Unique( ll, newList,length,c);
		            c.add(i,remove);
		            newList.remove(newList.size()-1);
		            
		        }

		    }
//	 public List<List<Integer>> permuteUnique(int[] nums) {
//	        
//	        List<List<Integer>> ll=new ArrayList<>();
//	        List<Integer> l=new ArrayList<>();
//	        List<Integer> candidates=new ArrayList<>();
//	        for(int i=0;i<nums.length;i++)
//	            candidates.add(nums[i]);
//	        permute_Unique( ll, l, nums.length, candidates);
//	        return ll;
//	        
//	        
//	    }
//	    public void permute_Unique(List<List<Integer>> ll,  List<Integer> l, int length, List<Integer> candidates)
//	    {
//	        if(l.size()==length)
//	        {
//	            List<Integer> newList=new ArrayList<>(l);
//	            ll.add(newList);
//	            return;
//	        }
//	        List<Integer> newList=new ArrayList<>(l);
//	        List<Integer> c=new ArrayList<>(candidates);
//	        for(int i=0;i<candidates.size();i++)
//	        {
//	             boolean ifFound=false;
//	                for(int j=0;j<i;j++)
//	                {
//	                    if(c.get(i)==c.get(j))
//	                    {
//	                        ifFound=true;
//	                        break;
//	                    }
//	                }
//	                if(ifFound)
//	                continue;
//	        
//	            int remove=c.get(i);
//	            newList.add(c.get(i));
//	            c.remove(i);
//	            permute_Unique( ll, newList,length,c);
//	            c.add(i,remove);
//	            newList.remove(newList.size()-1);
//	            
//	        }
//
//	    }
}

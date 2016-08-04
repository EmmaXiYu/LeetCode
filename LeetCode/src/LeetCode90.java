import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode90 {
	 public List<List<Integer>> subsetsWithDup(int[] nums) {
	        if(nums==null) return new ArrayList<>();
	        Arrays.sort(nums);// bad example{4,4,4,4,1,4}
	        List<List<Integer>> ll =new ArrayList<>();
	        List<Integer> l=new ArrayList<>();
	        List<Integer> c=new ArrayList<>();
	        for(int i =0;i<nums.length;i++){
	            c.add(nums[i]);
	        }
	        subsets( ll,  l,  c);
	        return ll;
	    }
	    
	    public void subsets(List<List<Integer>> ll, List<Integer> l, List<Integer> candidates)

	    {
	        List<Integer> newList =new ArrayList<>(l);
	        ll.add(newList);
	        List<Integer> newCandidates=new ArrayList<>(candidates);
	        int counter=0;
	        int pre=0;
	        boolean first=false;
	        while(newCandidates.size()!=0)
	        {
	            if(!first)
	            {
	                pre=newCandidates.get(counter);
	                first=true;
	                int remove=newCandidates.get(counter);
	            newList.add(remove);
	            newCandidates.remove(counter);
	            subsets( ll,newList,newCandidates);
	            newList.remove(newList.size()-1);
	            }
	            else if(first&&newCandidates.get(counter)==pre)
	           newCandidates.remove(counter);//remove duplicates 
	           else{ int remove=newCandidates.get(counter);
	            newList.add(remove);
	            newCandidates.remove(counter);
	            subsets( ll,newList,newCandidates);
	            newList.remove(newList.size()-1);
	            pre=remove;
	            //newCandidates.add(i,remove);
	            }
	        }
	    }
}

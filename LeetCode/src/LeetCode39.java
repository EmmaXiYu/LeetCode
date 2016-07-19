import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode39 {
	  public List<List<Integer>> combinationSum(int[] candidates, int target) {
	        List<List<Integer>> ll=new ArrayList<>();
	        List<Integer> l=new ArrayList<>();
	        Arrays.sort(candidates);
	       combination_Sum(ll, candidates,target, 0,l, 0);
	            
	        
	        return ll;
	    }
	    
	    public void combination_Sum( List<List<Integer>> ll,int[] candidates, int target, int sum,List<Integer> l, int index)
	    {
	        if(sum==target)
	        {
	        	 List<Integer> newList=new ArrayList<>(l);
	         ll.add(newList);
	         return;   
	        }
	        if(sum>target) 
	        {
	        	//sum-=l.get(l.size()-1);
	        	return;}
	        List<Integer> newList=new ArrayList<>(l);
	        for(int i=index;i<candidates.length;i++)
	        {
	        
	        int newSum=sum;
	        newSum+=candidates[i];
	        if(newSum>target){
	        	break;
	        }
	        
	        newList.add(candidates[i]);
	        combination_Sum(ll,candidates,  target , newSum, newList, i);
	        newList.remove(newList.size()-1);
	        }
	    }
	    
	    public static void main(String[] srgs){
	    	LeetCode39 obj=new LeetCode39();
	    	int [] l={8,7,4,3};
	    	List<List<Integer>> ll=obj.combinationSum(l, 11);
	    	System.out.println("[");
	    	for(int i=0;i<ll.size();i++)
	    	{
	    		System.out.print("[");
	    		for(int j=0;j<ll.get(i).size();j++)
	    		{
	    			if(j==ll.get(i).size()-1)
	    				System.out.print(ll.get(i).get(j));
	    			else System.out.print(ll.get(i).get(j)+",");
	    		}
	    		System.out.print("]");
	    	}
	    	System.out.println("]");
	    }

}

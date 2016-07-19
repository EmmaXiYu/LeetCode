import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class LeetCode40 {
	 public List<List<Integer>> combinationSum2(int[] candidates, int target) {
	       List<List<Integer>> ll=new ArrayList<>();
		        List<Integer> l=new ArrayList<>();
		        HashMap<List<Integer> ,Integer> hm=new HashMap<>();
		        Arrays.sort(candidates);
		       combination_Sum(ll, candidates,target, 0,l, -1,hm);
		            
		        
		        return ll;
	    }
	    
	     public void combination_Sum( List<List<Integer>> ll,int[] candidates, int target, int sum,List<Integer> l, int index, HashMap<List<Integer> ,Integer> hm)
		    {
		        if(sum==target)
		        {
		        	 List<Integer> newList=new ArrayList<>(l);
		        	   if(!hm.containsKey(newList))
		         {ll.add(newList);
		         hm.put(newList, ll.size()-1);}
		         return;   
		        }
		        if(sum>target) 
		        {
		        	//sum-=l.get(l.size()-1);
		        	return;}
		        List<Integer> newList=new ArrayList<>(l);
		        for(int i=index+1;i<candidates.length;i++)
		        {
		        
		        int newSum=sum;
		        newSum+=candidates[i];
		        if(newSum>target){
		        	break;
		        }
		        
		        newList.add(candidates[i]);
		        combination_Sum(ll,candidates,  target , newSum, newList, i,hm);
		        newList.remove(newList.size()-1);
		        }
		    }
	     public static void main(String[] srgs){
		    	LeetCode40 obj=new LeetCode40();
		    	int [] l={10,1,2,7,6,1,5};
		    	List<List<Integer>> ll=obj.combinationSum2(l, 8);
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

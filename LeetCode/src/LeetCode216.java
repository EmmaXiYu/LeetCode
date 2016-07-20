import java.util.ArrayList;
import java.util.List;

public class LeetCode216 {

	public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ll=new ArrayList<>();
		        List<Integer> l=new ArrayList<>();
		       combination_Sum(ll,k, n, 0,l, 1);
		        return ll;
       
   }
   public void combination_Sum( List<List<Integer>> ll, int num, int target, int sum,List<Integer> l, int index)
		    {
		        if(sum==target&&l.size()==num)
		        {
		        	List<Integer> newList=new ArrayList<>(l);
		        	 ll.add(newList);
		         return;   
		       }
		       if(l.size()>=num)
		           return;
		        if(sum>target) 
		       	return;
		        List<Integer> newList=new ArrayList<>(l);
		        for(int i=index;i<=9;i++)
		        {
		        int newSum=sum;
		        newSum+=i;
		        if(newSum>target){
		        	break;
		        }
		        newList.add(i);
		        combination_Sum(ll, num, target , newSum, newList, i+1);
		        newList.remove(newList.size()-1);
		  
		        }
		    }

}

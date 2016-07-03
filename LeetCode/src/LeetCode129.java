import java.util.ArrayList;
import java.util.List;

public class LeetCode129 {

	/*
	 * A little bit faster.
	 */
	 public int sumNumbers2(TreeNode root) {
	        
	     if(root==null) return 0;
	     return getSum(root, 0);
	      
	    }
	   
	  public int getSum(TreeNode root, int preLevel)
	  {
	      if(root==null) return 0;
	      else if(root.left==null&&root.right==null)
	       return preLevel+root.val;
	      preLevel=(root.val+preLevel)*10;
	      return getSum(root.left, preLevel)+getSum(root.right, preLevel);
	      
	  }
	
	/*
	 * Method one:very slow 
	 */
	 public int sumNumbers(TreeNode root) {
	        
	     if(root==null)
	     return 0;
	     int sum=0;
	     List<List<Integer>> ll=getList(root);
	     for(int i=0;i<ll.size();i++)
	     {
	         StringBuilder sb=new StringBuilder();
	         for(int j=0;j<ll.get(i).size();j++)
	        sb.append(ll.get(i).get(j));
	        int num=Integer.parseInt(sb.toString());
	        sum+=num;
	     }
	     
	     return sum;
	      
	    }
	    public List<List<Integer>> getList(TreeNode root)
	    {
	        if(root==null) return new ArrayList<>();
	        List<List<Integer>> ll=new ArrayList<>();
	        List<List<Integer>> left=getList(root.left);
	        List<List<Integer>> right=getList(root.right);
	         if(left.size()==0&&right.size()==0)
	         {
	             List<Integer> l=new ArrayList<>();
	             l.add(root.val);
	             ll.add(l);
	         }
	         else{
	             
	             for(int i=0;i<left.size();i++)
	             {
	                List<Integer> l=left.get(i);
	                l.add(0, root.val);
	                ll.add(l);
	             }
	                for(int i=0;i<right.size();i++)
	             {
	                   List<Integer> l=right.get(i);
	                l.add(0, root.val);
	                ll.add(l);
	             }
	         }
	        
	        return ll;
	        
	    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

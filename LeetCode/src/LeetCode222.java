import java.util.LinkedList;
import java.util.Queue;

public class LeetCode222 {

	/*
	 * Solution 1: Recursively 
	 * Best case: T(n)=lgn
	 * Worst case: T(n) =n
	 * S(n)=1
	 * Time Limit exceed
	 */
	   public int countNodes1(TreeNode root) {
	        if(root==null) return 0;
	        else 
	        {
	           return  1+countNodes1(root.left)+countNodes1     (root.right);
	        }
	    }
	   /*
	    * Method 2: breath-first-search
	    * T(n)=n
	    * S(n)=n
	    * Time limit exceeded
	    */
	   public int countNodes2(TreeNode root) {
	        if(root==null) return 0;
	        else{
	       Queue <TreeNode> queue=new LinkedList<>();
	       queue.add(root);
	       int counter=0;
	       while(!queue.isEmpty())
	       {
	           TreeNode tn=queue.poll();
	           counter++;
	           if(tn.left!=null)
	           queue.add(tn.left);
	           if(tn.right!=null)
	           queue.add(tn.right);
	           
	           
	       }
	       return counter;}
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

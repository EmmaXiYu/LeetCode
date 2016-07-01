import java.util.HashMap;
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
	   public static  int countNodes2(TreeNode root) {
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
	   
	   /*
	    * T(n)=(lgn)^2
	    * S(n)=1
	    */
	   public static int countNodes(TreeNode root) {
	       if(root==null) return 0;
	       int leftHeight=getLeftHeight(root.left);
	       int rightHeight=getLeftHeight(root.right);
	       if(leftHeight==rightHeight)
	       return (1<<leftHeight)+countNodes(root.right);
	       
	           
	           return (1<<rightHeight)+countNodes(root.left);
	     
	       
	        
	    }
	    
	    public static int getLeftHeight(TreeNode root)
	    {
	        if(root==null) return 0;
	        TreeNode iterator=root;
	        int height=0;
	        while(iterator!=null)
	        {
	            height++;
	            iterator=iterator.left;
	        }
	        return height;
	    }
	public static void main(String[] args) {
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(2);
		root.right=new TreeNode(3);
		root.left.left=new TreeNode(4);
		System.out.println(countNodes(root));

	}

}

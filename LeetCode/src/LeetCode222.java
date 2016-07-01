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
	   
	   
	   public static int countNodes(TreeNode root) {
	        if(root==null) return 0;
	         HashMap<TreeNode, Integer> hm=new HashMap<>();
	        int rootHeight=getLargestHeight(root, hm);
	        int lastLevelFullNodeNum=(int)Math.pow(2, rootHeight-1);
	        TreeNode iterator=root;
	        
	        while(iterator.left!=null||iterator.right!=null)
	        { int leftHeight=0;
	        int rigthHeight=0;
	        	if(iterator.left!=null)
	        		leftHeight=hm.get(iterator.left);
	        	if(iterator.right!=null)
	            rigthHeight=hm.get(iterator.right);
	            if(leftHeight>rigthHeight)
	            {
	                lastLevelFullNodeNum-=(int)Math.pow(2, leftHeight-1);
	                iterator=iterator.left;
	            }
	            else if(leftHeight==rigthHeight)
	            {
	                 iterator=iterator.right;
	            }
	            
	        }
	        int total=lastLevelFullNodeNum+(1-(int)Math.pow(2,rootHeight-1))/(1-2);
	        return total;
	        
	    }
	    
	    public static int getLargestHeight(TreeNode root , HashMap<TreeNode,Integer> hm)
	    {
	        if(root==null) return 0;
	        else{
	            
	            int height=1+Math.max(getLargestHeight(root.right, hm),getLargestHeight(root.left,hm));
	            hm.put(root, height);
	        return height ;}
	    }
	public static void main(String[] args) {
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(2);
		System.out.println(countNodes(root));

	}

}

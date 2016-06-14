
public class LeetCode100 {
	 public static  boolean isSameTree(TreeNode p, TreeNode q) {
	        
	        
	        if(p==null&&q==null) return true;
	        else if (p==null&&q!=null|| p!=null&&q==null) return false;
	        else 
	        {
	            return  p.val==q.val&& isSameTree(p.right, q.right)&& isSameTree(p.left, q.left);
	        }
	    }
	 
	 public static void main(String arg[])
	 {
		 
		 
	 }
}

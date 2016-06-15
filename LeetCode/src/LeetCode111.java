
public class LeetCode111 {

	public int minDepth(TreeNode root) {
	       if(root==null) return 0;
	       else if (root.right==null&& root.left==null)
	       return 1;
	       else{
	           int result=0;
	           if(root.right!=null&&root.left!=null)
	           result=1+ Math.min(minDepth(root.right),minDepth(root.left));
	           if(root.right==null&&root.left!=null)
	           result=1+ minDepth(root.left);
	           if(root.right!=null&&root.left==null)
	           result=1+ minDepth(root.right);
	           return result;
	       }
	    }
}

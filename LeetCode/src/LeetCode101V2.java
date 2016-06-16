
public class LeetCode101V2 {

	
	
	/*
	 * How to analyze time complexity? beat23.12% submission
	 */
	public boolean isSymmetric(TreeNode root) {
	       
	    return isSymmetric(root,root);
	    }
	    public boolean isSymmetric(TreeNode left, TreeNode right)
	    {
	        if(left==null&&right==null) return true;
	        else if (left==null||right==null) return false;
	        else{
	            
	            return (left.val==right.val)&&isSymmetric(left.left,right.right)&&isSymmetric(left.right, right.left);
	        }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

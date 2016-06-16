
public class LeetCode101V1 {
	 
	
	/*
	 * How to analyze time complexity? beat23.12% submission
	 */
	 public static boolean isSymmetric(TreeNode root) {
	       
		   if(root==null) return true;
		   else if(root.right==null&&root.left==null) return true;
		   else if(root.left==null||root.right==null) return false;
		   else{
		       
		     return   (root.right.val==root.left.val)&&isSymmetric( root.left.left, root.right.right)&&isSymmetric( root.left.right,root.right.left);
		       
		   }
		   
		    }
		    public static boolean isSymmetric(TreeNode left, TreeNode right)
		    {
		        if(left==null&&right==null) return true;
		        else if (left==null||right==null) return false;
		        else{
		            
		            return (left.val==right.val)&&isSymmetric(left.left,right.right)&&isSymmetric(left.right, right.left);
		        }
		    }
	public static void main(String[] args) {
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(2);
		root.right=new TreeNode(3);
	TreeNode	nodeLeft=root.left;
		nodeLeft.left=new TreeNode(3);
		TreeNode nodeRight=root.right;
		nodeRight.left=new TreeNode(2);
		
		System.out.print(isSymmetric(root));
	}

}

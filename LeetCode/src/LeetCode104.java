
public class LeetCode104 {

public static int maxDepth(TreeNode root) {
        
        if(root==null) return 0;
        return 1+Math.max(maxDepth(root.left), maxDepth(root.right));
    }
	public static void main(String[] args) {
		TreeNode root=new TreeNode(3);
		root.left=new TreeNode(1);
		root.right=new TreeNode(2);
		root.right.right=new TreeNode(2);
		System.out.println(maxDepth(root));
		
	}

}

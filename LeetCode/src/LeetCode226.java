
public class LeetCode226 {

	public static TreeNode invertTree(TreeNode root) {
        if(root==null) return root;
        else {
            TreeNode tempRight=root.right;
            root.right=invertTree(root.left);
            root.left=invertTree(tempRight);
            return root;
            
        }
        
    }
	public static void main(String[] args) {
		TreeNode root=new TreeNode(4);
		root.left=new TreeNode(2);
		root.left.right=new TreeNode(3);
		root.left.left= new TreeNode(1);
		root.right=new TreeNode(7);
		root.right.right=new TreeNode(9);
		root.right.left=new TreeNode(6);
		  
	    printInOrder(root);
	    TreeNode result=invertTree(root);
	  
	    
	    System.out.println();
	    printInOrder(result);

	}
	
	public static void printInOrder(TreeNode r)
	{
		if(r==null) return ;
		else{
		printInOrder(r.left);
		System.out.print(r.val);
		printInOrder(r.right);}
	}

}

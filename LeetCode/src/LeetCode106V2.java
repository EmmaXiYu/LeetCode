
public class LeetCode106V2 {
	 public static TreeNode buildTree(int[] inorder, int[] postorder) {
	        if(inorder==null||postorder==null) return null;
	        else if (inorder.length==0||postorder.length==0) return null;
	        else return build_Tree(inorder, 0, inorder.length-1, postorder, 0, postorder.length-1);
	    }
	    
	    public static TreeNode build_Tree(int [] inorder, int inorderStart, int inorderEnd, int [] postorder, int postorderStart, int postorderEnd)
	    {
	         TreeNode root=null;
	         if(inorderStart<=inorderEnd){
	        root=new TreeNode(postorder[postorderEnd]);
	        int i=0;
	        for(i=inorderStart;i<=inorderEnd;i++)
	        {
	            if(inorder[i]==root.val)
	                break;
	        }

	         root.left=build_Tree(inorder, inorderStart, i-1, postorder, postorderStart, i-1);
	        root.right=build_Tree(inorder, i+1, inorderEnd, postorder, i, postorderEnd-1);
	           
	           
	       }
	        
	        return root;
	    }
	    
	    public static void printTreeInOrder(TreeNode root)
		{
			if(root==null) return;
			else{
				printTreeInOrder(root.left);
			System.out.println(root.val);

			printTreeInOrder(root.right);
			}
		}
		
	public static void main(String[] args) {
		int [] inorder ={1,3,2};
		int [] postorder ={3,2,1};
		TreeNode root=buildTree(inorder, postorder);
		printTreeInOrder(root);
		

	}

}


public class LeetCode105 {

	 public TreeNode buildTree(int[] preorder, int[] inorder) {
	     if(preorder==null||inorder==null||preorder.length==0||inorder.length==0) return null;
	     return build_Tree(inorder, 0, inorder.length-1, preorder, 0);
	        
	    }
	    public TreeNode build_Tree(int [] inorder,int inStart, int inEnd,  int[] preorder, int preStart)
	    {
	        TreeNode root=null;
	        
	        if(inStart<=inEnd)
	        {
	            root=new TreeNode(preorder[preStart]);
	            int i=0;
	            for(i=inStart; i<=inEnd;i++)
	        {
	            if(inorder[i]==root.val)
	            break;
	            
	        }
	        
	        root.left=build_Tree(inorder, inStart, i-1, preorder, preStart+1);
	        root.right=build_Tree(inorder, i+1, inEnd, preorder, (preStart+(i-inStart)+1));
	        }
	        return root;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

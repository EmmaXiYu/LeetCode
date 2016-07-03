
public class LeetCode114 {

	public static void flatten(TreeNode root) {
        if(root==null||(root.left==null&&root.right==null))
        return;
       
        getFlatten(root);
        TreeNode iterator=root;
        while(iterator!=null)
        {
            iterator.right=iterator.left;
            iterator.left=null;
            iterator=iterator.right;
        }
        
        
        
    }
    public static TreeNode getFlatten(TreeNode root)
    {
        if(root==null) return null;
        else if(root.left==null&&root.right==null)
        return root;
        else if(root.left==null)
        {
            
             TreeNode lastLeftRight= getFlatten(root.right);
             root.left=root.right;
             root.right=null;
             return lastLeftRight;
        }
        
        else if(root.right==null)
    {
         TreeNode lastLeftLeft=getFlatten(root.left);
         return lastLeftLeft;
    }
        TreeNode lastLeftLeft=getFlatten(root.left);
       TreeNode lastLeftRight= getFlatten(root.right);
        lastLeftLeft.left=root.right;
        root.right=null;
        return lastLeftRight;
    }
	public static void main(String[] args) {
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(2);
		root.right=new TreeNode(3);
		flatten(root);
	}

}

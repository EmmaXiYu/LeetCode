
public class LeetCode110 {

	public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        else{
            boolean isBalanced=true;
         
            if(isBalanced(root.left)==false||isBalanced(root.right)==false)
            isBalanced= false;
            else if(isBalanced(root.left)==true&&isBalanced(root.left)==true)
            {
                if(Math.abs(depth(root.left)-depth(root.right))>1)
                isBalanced= false;
                else 
                isBalanced= true;
            
            }
            return isBalanced;
            
    }
    }
    public int depth(TreeNode root)
    {
        if(root==null) return 0;
      
        else {
            
            return 1+Math.max(depth(root.left), depth(root.right));
        }
        
        
    }
}


public class LeetCode235 {
	 public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
	        if(root==null||p==null||q==null) return null;
	        else if(ifNodeInTree(root,p)==false||ifNodeInTree(root,q)==false) return null;
	        else{
	            TreeNode returnNode=null;
	          
	                if((q.val<=root.val&&p.val>=root.val)||(q.val>=root.val&&p.val<=root.val)) 
	                returnNode=root;
	                else if(q.val<=root.val&&p.val<=root.val)
	                returnNode=lowestCommonAncestor(root.left,p,q);
	                else if (q.val>=root.val&&p.val>=root.val)
	                returnNode=lowestCommonAncestor(root.right,p,q);
	                return  returnNode;
	       }
	          
	        
	    }
	    
	    public boolean ifNodeInTree(TreeNode root, TreeNode node)
	    {
	        
	        
	      if(root==null) return false;
	      else{
	          boolean ifIn=false;
	          if(root.val==node.val) ifIn=true;
	          else if(root.val<node.val)
	          ifIn=ifNodeInTree(root.right,node);
	          else ifIn=ifNodeInTree(root.left,node);
	           return ifIn;
	      }
	    }
}

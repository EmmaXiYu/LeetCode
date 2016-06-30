import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LeetCode94 {

	/*
	 * Iteratively
	 */
	 public List<Integer> inorderTraversal(TreeNode root) {
	        if(root==null) return new ArrayList<>();
	        Stack<TreeNode> stack=new Stack<>();
	        List<Integer> returnInteger=new ArrayList<>();
	        TreeNode iterator=root.left;
	        stack.push(root);
	        while(!stack.isEmpty())
	        {
	         while(iterator!=null)
	        {
	            stack.push(iterator);
	            iterator=iterator.left;
	        }
	         TreeNode tn=stack.pop();
	         if(tn.right!=null){
	         stack.push(tn.right);
	            iterator=tn.right.left;
	         }
	         returnInteger.add(tn.val);
	        }
	       
	        return returnInteger;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

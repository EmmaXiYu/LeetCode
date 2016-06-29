import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class LeetCode144 {
/*
 * Iteratively
 */
	 public List<Integer> preorder_Traversal(TreeNode root) {
	       if(root==null) return new ArrayList<>();
	       else{
	           List<Integer> returnList=new ArrayList<>();
	           Queue<TreeNode> queue=new LinkedList<>();
	           Stack<TreeNode> stack=new Stack<>();
	           stack.add(root);
	           while(!stack.isEmpty()&&queue.isEmpty())
	           {
	               queue.add(stack.pop());
	                while(!queue.isEmpty())
	           {
	               TreeNode tn=queue.poll();
	               returnList.add(tn.val);
	               if(tn.left!=null)
	               queue.add(tn.left);
	               if(tn.right!=null)
	               stack.push(tn.right);
	           }
	           }
	          
	           
	           return returnList;
	       }
	    }
	/*
	 * Recursively
	 */
public List<Integer> preorderTraversal(TreeNode root) {
        
        if (root==null) return new ArrayList<>();
        else{
            List<Integer> returnList=new ArrayList<>();
            returnList.add(root.val);
            List<Integer> leftList=preorderTraversal(root.left);
            List<Integer> rightList=preorderTraversal(root.right);
            for(int i=0;i<leftList.size();i++)
            {
                returnList.add(leftList.get(i));
            }
             for(int i=0;i<rightList.size();i++)
            {
                returnList.add(rightList.get(i));
            }
            return returnList;
         }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

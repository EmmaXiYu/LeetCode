import java.util.ArrayList;
import java.util.List;

public class LeetCode230 {
/*
 * This method is extremely inefficient beat 1%
 */
	public int kthSmallest(TreeNode root, int k) {
	      List<Integer> l=inOrderTraveral(root);
	      return l.get(k-1);
	    }
	     public List<Integer> inOrderTraveral(TreeNode root)
	    {
	        if(root==null) return new ArrayList<>();
	        else {
	            List<Integer> leftList=inOrderTraveral(root.left);
	            List<Integer> rightList=inOrderTraveral(root.right);
	            List<Integer> newList=new ArrayList<>();
	            for(int i=0;i<leftList.size();i++)
	            {
	                newList.add(leftList.get(i));
	            }
	            newList.add(root.val);
	              for(int i=0;i<rightList.size();i++)
	            {
	                newList.add(rightList.get(i));
	            }
	            return newList;
	            
	        }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

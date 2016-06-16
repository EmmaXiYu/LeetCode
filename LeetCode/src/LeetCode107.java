import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeetCode107 {

	 public List<List<Integer>> levelOrderBottom(TreeNode root) {
	        
	        if(root==null)
	        {
	            List<List<Integer>> listOfList=new ArrayList<>();
	            return listOfList;
	        }
	        else {
	            
	              List<List<Integer>> listOfList=new ArrayList<>();
	              Queue<TreeNode> queue=new LinkedList<>();
	              queue.add(root);
	              while(!queue.isEmpty())
	              {
	                  
	                   int level=queue.size();
	                   List<Integer> list=new ArrayList<>();
	                   for(int i=0;i<level;i++)
	                   {
	                       TreeNode node=queue.peek();
	                       if(node.left!=null)
	                       queue.add(node.left);
	                       if(node.right!=null)
	                       queue.add(node.right);
	                       list.add(queue.poll().val);
	                       
	                   }
	                   listOfList.add(0,list);
	              }
	            return listOfList;
	            
	        }
	    }
}

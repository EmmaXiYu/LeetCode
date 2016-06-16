import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeetCode102V2 {

	  public List<List<Integer>> levelOrder(TreeNode root) {
	        
	      Queue<TreeNode> treeNodeQueue=new LinkedList<>();
	      List<List<Integer>> listOfList=new ArrayList<>();
	      if(root==null)
	      {
	          return listOfList;
	      }
	      else{
	      treeNodeQueue.add(root);
	      while(!treeNodeQueue.isEmpty())
	     {     
	         List<Integer> list=new ArrayList<>();
	         int level=treeNodeQueue.size();
	         for(int i=0;i<level;i++){
	             
	             TreeNode  current=treeNodeQueue.peek();
	        
	      if(current.left!=null)
	         treeNodeQueue.add(current.left);    
	            if(current.right!=null)
	      treeNodeQueue.add(current.right);
	      list.add(treeNodeQueue.poll().val);
	         }
	     
	      
	      
	      listOfList.add(list);
	      
	     } 
	        return listOfList;}
	    }
}

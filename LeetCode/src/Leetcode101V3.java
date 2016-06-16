import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Leetcode101V3 {

	/*
	 * beat 2.3% submission
	 */
	public boolean isSymmetric(TreeNode root) {
	     
	       if(root==null) return true;
	       else {
	           
	           Queue<TreeNode> queue=new LinkedList<>();
	           queue.add(root);
	           boolean ifSysmmetric=true;
	           while(ifSysmmetric&&!queue.isEmpty())
	           {
	               List<String> list=new ArrayList<>();
	               
	                   TreeNode node =queue.peek();
	                   int level=queue.size();
	                  
	                   for(int i=0;i<level;i++)
	                   {
	                       node=queue.poll();
	                       if(node!=null){
	                           
	                        queue.add(node.left);
	                        queue.add(node.right);
	                        list.add(node.val+"");
	                           
	                       } else
	                       list.add("null");
	                   }
	                   
	              
	              for(int i=0;i<list.size()/2;i++)
	              {
	                  if(!list.get(i).equals(list.get(list.size()-i-1)))
	                  {
	                      ifSysmmetric=false;
	                      break;
	                  }
	              }
	           }
	          return ifSysmmetric; 
	           
	       }}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

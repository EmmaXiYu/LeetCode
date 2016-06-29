import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeetCode199 {

	 public List<Integer> rightSideView(TreeNode root) {
	        
	        if(root==null) return new ArrayList<>();
	        else 
	        {
	            Queue<TreeNode> queue=new LinkedList<>();
	            List<Integer> returnList=new ArrayList<>();
	            queue.add(root);
	            int levelNum=1;
	            int num=1;
	            while(!queue.isEmpty()){
	                levelNum=num;
	                num=0;
	            for(int i=0;i<levelNum;i++)
	            {
	                
	                TreeNode tn=queue.poll();
	                if(tn.left!=null)
	                {queue.add(tn.left);
	                    num++;
	                }
	                if(tn.right!=null)
	                {queue.add(tn.right);
	                num++;
	                }
	                if(i==levelNum-1)
	                returnList.add(tn.val);
	            }
	        }
	            return returnList;
	        }
	        
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

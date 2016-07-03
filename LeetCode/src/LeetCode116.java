import java.util.LinkedList;
import java.util.Queue;

public class LeetCode116 {

	
	
	 public void connect(TreeLinkNode root) {
	        if(root==null) return ;
	         
	         Queue<TreeLinkNode> queue = new LinkedList<>();
	         queue.add(root);
	         int levelNum=1;
	         int iteratorNum=0;
	         int nextLevelNum=1;
	         while(!queue.isEmpty())
	         {
	             levelNum=nextLevelNum;
	             nextLevelNum=0;
	             for(int i=0;i<levelNum;i++){
	             TreeLinkNode tln=queue.poll();
	              iteratorNum++;
	              if(iteratorNum==levelNum)
	              {tln.next=null;
	                  iteratorNum=0;
	              }
	              else
	              {
	                   TreeLinkNode tln2=queue.peek();
	                   tln.next=tln2;
	              }
	              if(tln.left!=null)
	              {
	                  queue.add(tln.left);
	                  nextLevelNum++;
	              }
	              if(tln.right!=null)
	              {
	                  queue.add(tln.right);
	                  nextLevelNum++;
	              }
	              
	             }
	         }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

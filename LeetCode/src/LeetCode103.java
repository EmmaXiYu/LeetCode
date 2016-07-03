import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class LeetCode103 {
	  public static  List<List<Integer>> zigzagLevelOrder(TreeNode root) {
          if(root==null) return new ArrayList<>();
          Stack<TreeNode> stack=new Stack<>();
          Queue<TreeNode>  queue=new LinkedList<>();
          List<List<Integer>> ll=new ArrayList<>();
           stack.push(root);
           int level=0;
           int levelNum=1;
           int num=1;
           while(!stack.isEmpty())
           {
               levelNum=num;
               num=0;
               List<Integer> l=new ArrayList<>();
               
               for(int i=0;i<levelNum;i++)
               {
                   TreeNode tn=stack.pop();
                   l.add(tn.val);
                   if(level%2==0)
                   { 
                       if(tn.left!=null)
                       {
                           queue.add(tn.left);
                           num++;
                       }
                       if(tn.right!=null)
                       {
                           queue.add(tn.right);
                           num++;
                       }
                   }
                   else if(level%2!=0)
                   {
                       if(tn.right!=null)
                       {
                           queue.add(tn.right);
                           num++;
                       }
                       if(tn.left!=null)
                       {
                           queue.add(tn.left);
                           num++;
                       }
                   }
                   
               }
               for(int i=0;i<num;i++)
               stack.push(queue.poll());
               level++;
               ll.add(l);
           }
           return ll;
  }
	  
	  public static void main(String[] args)
	  {
		  TreeNode tn=new TreeNode(1);
		  tn.left=new TreeNode(2);
		  tn.left.left=new TreeNode(4);
		  TreeNode right=new TreeNode(3);
		  tn.right=right;
		 // right.left=new TreeNode(15);
		  right.right=new TreeNode(5);
		  List<List<Integer>> ll=zigzagLevelOrder(tn);
		  System.out.println("[");
		  for(int i=0;i<ll.size();i++)
		  {
			  System.out.print("[");
			  for(int j=0;j<ll.get(i).size()-1;j++)
			  {
				  System.out.print(ll.get(i).get(j)+",");
			  }
			  System.out.print(ll.get(i).get(ll.get(i).size()-1));
			  System.out.println("]");
		  }
		  System.out.println("]");
	  }
}

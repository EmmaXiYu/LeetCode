import java.util.ArrayList;
import java.util.List;

public class LeetCode95 {

	
	  public static List<TreeNode> generateTrees(int n) {
          if(n<1) return new ArrayList<>();
          if(n==1) 
          {
              List<TreeNode> l=new ArrayList<>();
              l.add(new TreeNode(1));
              return l;
          }
          List<TreeNode> list=new ArrayList<>();
         
          for(int i=1;i<=n;i++)
          {
              TreeNode tn=generate_TreeNode(0,n,i);
              list.add(tn);
          }
          return list;
    }
    public static TreeNode generate_TreeNode(int min, int max, int n)
    {
        if(n<=0) return null;
        else if (n>max)return null; 
        else if(n<=min) return null;
         TreeNode root=new TreeNode(n);
         root.left=generate_TreeNode(1,n-1,n-1);
         root.right=generate_TreeNode(n,max, n+1);
         return root;
    }
	public static void main(String[] args) {
		generateTrees(2);


	}

}

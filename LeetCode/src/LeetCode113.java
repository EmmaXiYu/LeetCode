import java.util.ArrayList;
import java.util.List;

public class LeetCode113 {

	
public List<List<Integer>> pathSum(TreeNode root, int sum) {
        
        if(root==null) return new ArrayList<>();
        else if(root.left==null&&root.right==null) 
        {
            if(root.val==sum)
            {
                List<List<Integer>> ll=new ArrayList<>();
                List<Integer> l=new ArrayList<>();
                l.add(root.val);
                ll.add(l);
                return ll;
            }
            else 
            return new ArrayList<>();
        }
        List<List<Integer>> leftLL=pathSum(root.right, sum-root.val);
        List<List<Integer>> rightLL=pathSum(root.left, sum-root.val);
        List<List<Integer>> ll=new ArrayList<>();
        if(leftLL.size()!=0)
        {
            for(int i=0;i<leftLL.size();i++)
            {
                List<Integer> l=leftLL.get(i);
                l.add(0,root.val);
                ll.add(l);
            }
        }
        if(rightLL.size()!=0)
        {
            for(int i=0;i<rightLL.size();i++)
            {
                List<Integer> l=rightLL.get(i);
                l.add(0,root.val);
                ll.add(l);
            }
        }
        return ll;
        
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

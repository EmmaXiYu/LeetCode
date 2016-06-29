import java.util.ArrayList;
import java.util.List;

public final class LeetCode98 {
/*
 * This method is extremely inefficient  beat 1%
 */
	public boolean isValidBST(TreeNode root) {
        if(root==null) return true;
        else if(root.left==null&&root.right==null) return true;
      else{
          List<Integer> l=inOrderTraveral(root);
          for(int i=1;i<l.size();i++)
          {
              if(l.get(i)<=l.get(i-1))
              return false;
          }
          return true;
      }
        
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

import java.util.ArrayList;
import java.util.List;

public class LeetCode236 {
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        if(root==null) return null;
        if(p==null||q==null) return null;
        else{
            TreeNode returnNode=null;
         
        List<TreeNode> ancestorNode=new ArrayList<>();
        List<Boolean> b=findAncestorNode(root, p , q,ancestorNode);
        if(ancestorNode.size()!=0)
        returnNode= ancestorNode.get(0);
        return returnNode;
            
        }
    }
    
    public static List<Boolean> findAncestorNode(TreeNode root, TreeNode p, TreeNode q, List<TreeNode> ancestorList)
    {
        if(root==null)
        {
             List<Boolean> newBooleanList=new ArrayList<>();
             newBooleanList.add(false);
             newBooleanList.add(false);
        }
        
     List<Boolean> leftList=findAncestorNode( root.left, p,  q,  ancestorList);
        List<Boolean> rightList=findAncestorNode( root.right, p,  q,  ancestorList);
        List<Boolean> newBooleanList=new ArrayList<>();
        for(int i=0;i<2;i++)
        {
            boolean b= leftList.get(i)||rightList.get(i);
            newBooleanList.add(b);
        }
        if(newBooleanList.get(0)==false && root.equals(p))
        newBooleanList.set(0, true);
        if(newBooleanList.get(1)==false && root.equals(q))
        newBooleanList.set(1,true);
        if(newBooleanList.get(0)==true&& newBooleanList.get(1)==true)
        ancestorList.add(root);
        return newBooleanList;
    }
}

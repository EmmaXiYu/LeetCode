import java.util.ArrayList;
import java.util.List;

public class LeetCode257 {

	 public List<String> binaryTreePaths(TreeNode root) {
	        if(root==null) return new ArrayList<>();
	        else{
	           List<String> path=binary_Tree_Paths( root);
	          
	           return path;
	        }
	    }
	    
	    public List<String> binary_Tree_Paths(TreeNode root)
	    {
	        
	        if(root==null) 
	       
	            return null;
	        
	       
	        else{
	            
	            List<String> leftList=binary_Tree_Paths( root.left);
	             List<String> rightList=binary_Tree_Paths( root.right);
	             List<String> newList=new ArrayList<>();
	             if(leftList!=null){
	             for(int i=0;i<leftList.size();i++)
	             {
	                 String l=leftList.get(i);
	                 l=root.val+"->"+l;;
	                 newList.add(l);
	             }
	                 
	             }
	            
	              if(rightList!=null){
	             for(int i=0;i<rightList.size();i++)
	             {
	                 String l=rightList.get(i);
	                 l=root.val+"->"+l;;
	                 newList.add(l);
	             }
	             }
	             if(leftList==null&&rightList==null){
	                 
	                 String l=root.val+"";
	                   newList.add(l);
	             }
	             return newList;}
	        }
}

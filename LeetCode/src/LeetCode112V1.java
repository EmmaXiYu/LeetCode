import java.util.ArrayList;
import java.util.List;

public class LeetCode112V1 {

	/*
	 * How to analyze time complexity? 
	 * Accepted with ?
	 */
public boolean hasPathSum(TreeNode root, int sum) {
        
        if(root==null) return false;
        
        else {
        List<Integer> sumList=pathSum(root);
        boolean ifFound=false;
         for(int i=0;i<sumList.size();i++)
        {
            
           if(sumList.get(i)==sum) {
               ifFound=true;
               break;
           }
          
        }
        return ifFound;}
    }
    public List<Integer> pathSum(TreeNode root)
    {
         
        if(root==null) {
            return null;
            
        }
        else{
        List<Integer> nodeSum=new ArrayList<>();
        List<Integer> leftNodeSum=pathSum(root.left);
        List<Integer> rightNodeSum=pathSum(root.right);
        if(leftNodeSum==null&&rightNodeSum==null)
        {
            nodeSum.add(root.val);
        }
        else{
        if(leftNodeSum!=null){
        for(int i=0;i<leftNodeSum.size();i++)
        {
            
           nodeSum.add(leftNodeSum.get(i)+root.val);
        }}
         if(rightNodeSum!=null){
          for(int j=0;j<rightNodeSum.size();j++)
        {
            
           nodeSum.add(rightNodeSum.get(j)+root.val);
        }}
        }
            
          return nodeSum;  
        }
        
        
        
    }
    /*
     * Space complexity is improved, but time complexity is not.
     */
    
    public boolean hasPathSum2(TreeNode root, int sum) {
        
        if(root==null) return false;
        if(root.right==null&& root.left==null) return (root.val==sum);
        else {
            
            return hasPathSum(root.right,sum-root.val)||hasPathSum(root.left, sum-root.val);
        }
          
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

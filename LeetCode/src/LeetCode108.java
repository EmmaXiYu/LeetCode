
public class LeetCode108 {

	 public TreeNode sortedArrayToBST(int[] nums) {
	        if(nums==null) return null;
	        return sorted_Array_To_BST(nums, 0, nums.length-1);
	    
	    }
	    
	    public TreeNode sorted_Array_To_BST(int [] nums, int start, int end)
	    {
	        if(start>end) return null;
	        int mid=start+(end-start)/2;
	        TreeNode root=new TreeNode(nums[mid]);
	        root.left=sorted_Array_To_BST(nums, start, mid-1);
	        root.right=sorted_Array_To_BST(nums, mid+1, end);
	        return root;
	    }
	    
	    
//	    public TreeNode sortedArrayToBST(int[] nums) {
//	        if(nums==null) return null;
//	        return sorted_Array_To_BST(nums, 0, nums.length-1);
//	    
//	    }
//	    
//	    public TreeNode sorted_Array_To_BST(int [] nums, int start, int end)
//	    {
//	        if(start>end) return null;
//	    else if(start==end) return new  TreeNode(nums[start]);
//	        int mid=start+(end-start)/2+1;
//	        TreeNode root=new TreeNode(nums[mid]);
//	        root.left=sorted_Array_To_BST(nums, start, mid-1);
//	        root.right=sorted_Array_To_BST(nums, mid+1, end);
//	        return root;
//	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

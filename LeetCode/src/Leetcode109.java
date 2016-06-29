
/*
 * Given a singly linked list where elements are 
 * sorted in ascending order, convert it to a height balanced BST.
 */
public class Leetcode109 {

	/*
	 * Not Balanced
	 */
//	 public TreeNode sortedListToBST(ListNode head) {
//		 if(head==null) return null;
//		 else{
//	        TreeNode treeNode=new TreeNode(head.val);
//	        ListNode ln=head.next;
//	        while(ln!=null)
//	        {
//	        	addToBST(treeNode, ln);
//	        	ln=ln.next;
//	        }
//	        		
//		 return treeNode;
//		 }
//	    }
//	 
//	 public TreeNode addToBST(TreeNode treeNode, ListNode ln)
//	 {
//	          if(treeNode==null) return new TreeNode(ln.val);
//	        
//	          else if(ln.val<=treeNode.val)
//			 {
//					 treeNode.left= addToBST(treeNode.left, ln);
//			 }
//				
//			 else if (ln.val>treeNode.val)
//			 { 
//					 treeNode.right=addToBST(treeNode.right, ln);
//			 }
//				
//		 
//		 return treeNode;
//	 }
	public TreeNode sortedListToBST(ListNode head) {
        if(head==null) return null;
        else{
        ListNode iterator=head;
        int counter=1;
        while(iterator.next!=null)
        {
            iterator=iterator.next;
            counter++;
        }
       int [] array=new int[counter];
       iterator=head;
       counter=0;
       while(iterator!=null)
       {
           array[counter]=iterator.val;
           iterator=iterator.next;
           counter++;
       }
      return  sorted_List_To_BST(array, 0 ,array.length-1);
        }
        
    }
    public TreeNode sorted_List_To_BST(int [] array,int start, int end)
    {
        if(start<=end){
        int mid=start+(end-start)/2;
        TreeNode treeNode=new TreeNode(array[mid]);
        treeNode.left=sorted_List_To_BST(array, start, mid-1);
        treeNode.right=sorted_List_To_BST(array, mid+1, end);
        return treeNode;}
        else return null;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

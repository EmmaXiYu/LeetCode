
public class LeetCode106 {

	  public static TreeNode buildTree(int[] inorder, int[] postorder) {
	     
		  if(inorder==null||postorder==null||inorder.length==0||postorder.length==0) return null;
		  else {
		 TreeNode rootNode=new TreeNode(postorder[postorder.length-1]);
		 
		  int root=postorder[postorder.length-1];
		  int rootPositionInOrder=0;
		
		  for(int i=0;i<inorder.length;i++)
		  {
			  if(inorder[i]==root)
			  {
				  rootPositionInOrder=i;
				  break;
			  }
		  }
		  int leftNodeEnd=rootPositionInOrder-1;
		  int rightNodeStart=rootPositionInOrder;
		  int[] inorderLeft=new int[leftNodeEnd+1];
		  for(int i=0; i<leftNodeEnd+1;i++)
		  {
			  inorderLeft[i]=inorder[i];
		  }
		  int [] postorderLeft=new int [leftNodeEnd+1];
		  for(int i=0; i<leftNodeEnd+1;i++)
		  {
			  postorderLeft[i]=postorder[i];
		  }
		  int [] inorderRight=new int [inorder.length-1-rightNodeStart];
		  for(int i=0;i<inorderRight.length;i++)
		  {
			  inorderRight[i]=inorder[i+leftNodeEnd+2];
		  }
		  int [] postorderRight=new int [inorder.length-1-rightNodeStart];
		  for(int i=0;i<postorderRight.length;i++)
		  {
			  postorderRight[i]=postorder[i+rootPositionInOrder];
		  }
		  
		  rootNode.left=buildTree(inorderLeft, postorderLeft);
		  rootNode.right=buildTree(inorderRight, postorderRight);
		  
		 return rootNode;}
	    }
	public static void main(String[] args) {
		int [] inorder ={10,3,2,1,4,7,5,8};
		int [] postorder ={10,2,3,4,7,8,5,1};
		TreeNode root=buildTree(inorder, postorder);
		printTreeInOrder(root);
		
	}
	
	public static void printTreeInOrder(TreeNode root)
	{
		if(root==null) return;
		else{
			printTreeInOrder(root.left);
		System.out.println(root.val);

		printTreeInOrder(root.right);
		}
	}

}

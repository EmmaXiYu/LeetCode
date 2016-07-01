
public class LeetCode106 {

//	  public static TreeNode buildTree(int[] inorder, int[] postorder) {
//	     
//		  if(inorder==null||postorder==null||inorder.length==0||postorder.length==0) return null;
//		  else {
//		 TreeNode rootNode=new TreeNode(postorder[postorder.length-1]);
//		 
//		  int root=postorder[postorder.length-1];
//		  int rootPositionInOrder=0;
//		
//		  for(int i=0;i<inorder.length;i++)
//		  {
//			  if(inorder[i]==root)
//			  {
//				  rootPositionInOrder=i;
//				  break;
//			  }
//		  }
//		  int leftNodeEnd=rootPositionInOrder-1;
//		  int rightNodeStart=rootPositionInOrder;
//		  int[] inorderLeft=new int[leftNodeEnd+1];
//		  for(int i=0; i<leftNodeEnd+1;i++)
//		  {
//			  inorderLeft[i]=inorder[i];
//		  }
//		  int [] postorderLeft=new int [leftNodeEnd+1];
//		  for(int i=0; i<leftNodeEnd+1;i++)
//		  {
//			  postorderLeft[i]=postorder[i];
//		  }
//		  int [] inorderRight=new int [inorder.length-1-rightNodeStart];
//		  for(int i=0;i<inorderRight.length;i++)
//		  {
//			  inorderRight[i]=inorder[i+leftNodeEnd+2];
//		  }
//		  int [] postorderRight=new int [inorder.length-1-rightNodeStart];
//		  for(int i=0;i<postorderRight.length;i++)
//		  {
//			  postorderRight[i]=postorder[i+rootPositionInOrder];
//		  }
//		  
//		  rootNode.left=buildTree(inorderLeft, postorderLeft);
//		  rootNode.right=buildTree(inorderRight, postorderRight);
//		  
//		 return rootNode;}
//	    }
	
	 public static TreeNode buildTree(int[] inorder, int[] postorder) {
	        if(inorder==null||postorder==null) return null;
	        else if (inorder.length==0||postorder.length==0) return null;
	        else return build_Tree(inorder, 0, inorder.length-1, postorder, postorder.length-1);
	    }
	    
	    public static TreeNode build_Tree(int [] inorder, int inorderStart, int inorderEnd, int [] postorder,  int postorderEnd)
	    {
	         TreeNode root=null;
	         if(inorderStart<=inorderEnd){
	        root=new TreeNode(postorder[postorderEnd]);
	        int i=0;
	        for(i=inorderStart;i<=inorderEnd;i++)
	        {
	            if(inorder[i]==root.val)
	                break;
	        }
	        
	        // root.right = build(inorder,inStart,index+1,postorder,postStart-1);   
	   // root.left = build(inorder,index-1,inEnd,postorder,postStart-(inStart-index)-1);

	         root.left=build_Tree(inorder, inorderStart, i-1, postorder,postorderEnd-1-(inorderEnd-i));
	        root.right=build_Tree(inorder, i+1, inorderEnd, postorder, postorderEnd-1);
	           
	           
	       }
	        
	        return root;
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
	
	public static void main(String[] args) {
		int [] inorder ={4,5,6,7,8,10,14,15,20};
		int [] postorder ={4,6,8,7,5,14,20,15,10};
		TreeNode root=buildTree(inorder, postorder);
		printTreeInOrder(root);
		
	}
	

}

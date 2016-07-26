import java.util.ArrayList;
import java.util.List;

public class LeetCode95 {

	
	 public List<TreeNode> generateTrees(int n) { 
	    if(n<=0) return new ArrayList<>();
	    if(n==1) 
	    {
	    	TreeNode head=new TreeNode(1);
	    	List<TreeNode> l=new ArrayList<>();
	    	l.add(head);
	    	return l;	
	    
	    }
	    TreeNode head=new TreeNode(1);
    	List<TreeNode> l=new ArrayList<>();
    	List<List<TreeNode>> ll=new ArrayList<>();
    	l.add(head);
    	ll.add(l);
	    generate_Trees(ll,n);
	    return ll.get(ll.size()-1);
	 }
	 
	 public void generate_Trees(List<List<TreeNode>> ll, int n)
	 {
		 if(n==1)return;
		 
	 }
	    public void traverseChangeValue(TreeNode head, int plus)
	    {
	        if(head==null) return;
	        traverseChangeValue( head.left, plus);
	        head.val=head.val+plus;
	        traverseChangeValue( head.right, plus);
	    }
	    
	public static void main(String[] args) {
		LeetCode95 obj=new LeetCode95();
		obj.generateTrees(3);


	}

}

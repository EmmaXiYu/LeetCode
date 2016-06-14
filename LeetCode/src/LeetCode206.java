import java.util.ArrayList;

public class LeetCode206 {
	 public ListNode reverseList(ListNode head) {
	        
	        
	       if(head==null) return null;
	       else {
	           ArrayList<Integer> nodeList=new ArrayList<>();
	           ListNode iterator=head;
	           while(iterator!=null)
	           {
	               nodeList.add(iterator.val);
	               iterator=iterator.next;
	           }
	           ListNode returnNode =new ListNode(nodeList.get(nodeList.size()-1));
	           ListNode returnIterator=returnNode;
	           for(int i=nodeList.size()-2;i>=0;i--)
	           {
	              returnIterator.next=new ListNode(nodeList.get(i));
	              returnIterator=returnIterator.next;
	           }
	           return returnNode;
	       }
	    }
}

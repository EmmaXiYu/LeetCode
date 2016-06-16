
public class LeetCode234 {

	
	
	 public boolean isPalindrome(ListNode head) {
	        if(head==null) return true;
	        else if(head.next==null) return true;
	        else if(head.next.next==null)
	        {
	            boolean ifP=true;
	            
	            if(head.val!=head.next.val) return ifP=false;
	            return ifP;
	        }
	        else {
	            boolean ifP=true;
	            ListNode iterator =head;
	            int length=0;
	            while(iterator!=null)
	            {
	                length++;
	                iterator=iterator.next;
	            }
	        
	            int nodeCounter=2;
	            ListNode pre=head;
	            ListNode current=pre.next;
	             ListNode next=current.next;
	            while(nodeCounter<=length/2)
	            {
	                current.next=pre;
	                if(pre.equals(head))
	                pre.next=null;
	                pre=current;
	                current=next;
	                next=next.next;
	                nodeCounter++;
	                
	            }
	          if(length%2!=0)
	          current=current.next;
	            while(pre!=null&&current!=null)
	            {
	                if(pre.val!=current.val){
	                    ifP=false;
	                    break;
	                }
	                pre=pre.next;
	                current=current.next;
	            }
	            
	            return ifP;
	            
	        }
	    }
}

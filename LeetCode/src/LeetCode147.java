
public class LeetCode147 {

	
	  public ListNode insertionSortList(ListNode head) {
	        
	        if(head==null)
	        return null;
	        else if(head.next==null) return head;
	        else{
	            ListNode sortedFirst=head;
	            ListNode sortedLast=head;
	            ListNode insertedNode=head.next;
	            while(insertedNode!=null)
	            {
	                if(insertedNode.val<=sortedFirst.val)
	                {
	                    sortedLast.next=insertedNode.next;
	                    insertedNode.next=sortedFirst;
	                    sortedFirst=insertedNode;
	                    head=insertedNode;
	                }
	                else if(insertedNode.val>sortedLast.val)
	                    sortedLast=insertedNode;
	                else{
	                    sortedLast.next=insertedNode.next;
	                    insertedNode.next=null;
	                    ListNode insertionIterator=sortedFirst.next;
	                    ListNode insertionIteratorPre=sortedFirst;
	                    while(insertedNode.val>insertionIterator.val)
	                    {
	                        insertionIterator=insertionIterator.next;
	                        insertionIteratorPre=insertionIteratorPre.next;
	                    }
	                    insertionIteratorPre.next=insertedNode;
	                    insertedNode.next=insertionIterator;
	               
	                }
	                insertedNode=sortedLast.next;
	            }
	            return head;
	        }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


public class LeetCode86 {

	 public ListNode partition(ListNode head, int x) {
	      if(head==null) return null;
	      ListNode iterator=head;
	      ListNode lessEnd=null;
	      ListNode greaterEqualStart=null;
	      ListNode greaterEqualEnd=null;
	      while(iterator!=null)
	      {
	          if(iterator.val<x)
	          {
	             if(lessEnd==null&&greaterEqualStart==null)
	               {  lessEnd=iterator;
	                  iterator=iterator.next;
	               }
	                 
	             else if (lessEnd==null&&greaterEqualStart!=null)
	             {
	                 ListNode nextNode=iterator.next;
	                 iterator.next=null;
	                 greaterEqualEnd.next=nextNode;
	                 head=iterator;
	                 lessEnd=iterator;
	                 head.next=greaterEqualStart;
	                 iterator=nextNode;
	             }
	             else if(lessEnd!=null&&greaterEqualStart!=null)
	             {
	                 ListNode nextNode=iterator.next;
	                 iterator.next=null;
	                 greaterEqualEnd.next=nextNode;
	                 lessEnd.next=iterator;
	                 iterator.next=greaterEqualStart;
	                 lessEnd=iterator;
	                 iterator=nextNode;
	                 
	             }
	            else if(lessEnd!=null&&greaterEqualStart==null)
	             {
	               
	                 lessEnd.next=iterator;
	                 lessEnd=iterator;
	                 iterator=iterator.next;
	                 
	             }
	             
	          }
	          
	          else 
	          {
	              if(greaterEqualStart==null)
	              {
	                  greaterEqualStart=iterator;
	                  greaterEqualEnd=iterator;
	                  iterator=iterator.next;
	              }
	              else 
	              {
	                  greaterEqualEnd=iterator;
	                  iterator=iterator.next;
	              }
	          }
	      }
	      return head;
	    } static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

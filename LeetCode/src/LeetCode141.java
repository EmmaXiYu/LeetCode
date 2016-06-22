
public class LeetCode141 {
	 public static  boolean hasCycle(ListNode head) {
	      if(head==null) return false;
	       else if (head.next==null) return false;
	      else{
	          boolean hasCycle=false;
	          ListNode first=head;
	          ListNode second=head.next;
	          while(first!=null&&second!=null)
	          {
	              first=first.next;
	              if(second.next!=null)
	              {
	              second=second.next.next;
	                  
	              }
	              else
	              {
	                  hasCycle=false;
	                  break;
	              }
	              if(first!=null&&second!=null&&first.equals(second))
	              {
	                   hasCycle=true;
	                  break;
	              }
	          }
	          if(first==null||second==null)
	          hasCycle=false;
	          return hasCycle;
	      }
	    }
	 
	 public static void main(String[] args)
	 {
		 ListNode root=new ListNode(1);
		 root.next=new ListNode(2);
		 root.next.next=root;
		 System.out.println(hasCycle(root));
	 }

}

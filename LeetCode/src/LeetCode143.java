import java.util.ArrayList;
import java.util.List;

public class LeetCode143 {

public static void reorderList(ListNode head) {
	
	 
	        if(head==null||head.next==null) return;
	        ListNode iterator=head;
	        int counter=0;
	        while(iterator!=null)
	        {
	            counter++;
	            iterator=iterator.next;
	        }
	        ListNode tail=iterator;
	        iterator=head;
	        int mid=counter/2;
	         while(mid!=1)
	        {
	            mid--;
	            iterator=iterator.next;
	        }
	        ListNode midNode=iterator.next;
	        iterator.next=null;
	        ListNode newHead=reverse(midNode,tail);
	        
	        iterator=head;

	       ListNode headIterator=head;
	       ListNode tail2=null;
	        while(iterator!=null)
	        {
	            ListNode newHeadIterator=newHead.next;
	            headIterator=iterator.next;
	            iterator.next=newHead;
	            newHead.next=headIterator;
	            newHead=newHeadIterator;
	            if(headIterator==null){
	            	tail2=iterator.next ;
	           
	            }
	            iterator=headIterator;
	 
	        }
	        if(newHead!=null)
	        tail2.next=newHead;
	    }
	    
	    public static ListNode reverse (ListNode head, ListNode tail)
	    {
	        if(head==null) return null;
	        ListNode headNext=head.next;
	        if(headNext==null) return head;
	        ListNode headNextNext=headNext.next;
	        head.next=null;
	        headNext.next=head;
	        if(headNextNext==null)
	        	return headNext;
	        else
	        {
	        ListNode reverseHead=reverse(headNextNext,tail);   
	        headNextNext.next=headNext;
	        return reverseHead;}
	        
	    }
/*
 * Time limitation exceeded
 */
//        
//        if(head==null) return;
//        else if(head.next==null) return;
//        else if(head.next.next==null) return;
//        else{
//            
//           ListNode startNode=head;
//           ListNode startNodeNext=head.next;
//          
//           while(startNode.next!=null)
//           {
//               
//           ListNode lastNode=getLastNode(startNode).get(0);
//           ListNode preLastNode=getLastNode(startNode).get(1); 
//           if(!lastNode.equals(startNodeNext)){
//           preLastNode.next=null;
//           startNode.next=lastNode;
//           lastNode.next=startNodeNext;
//           startNode=startNodeNext;
//           startNodeNext=startNode.next;}
//           else{
//               break;
//           }
//           
//           }
//           
//        }
//        
//    }
//    
//    public static List<ListNode> getLastNode(ListNode head)
//    {
//        if(head==null) return new ArrayList<>();
//        else if(head.next==null) return new ArrayList<>();
//        else{ListNode iterator=head.next;
//        ListNode iteratorPre=head;
//        while(iterator.next!=null) {
//            iterator=iterator.next;
//            iteratorPre=iteratorPre.next;
//        }
//        List<ListNode> list=new ArrayList<>();
//        list.add(iterator);
//        list.add(iteratorPre);
//        return list;}
//    }
	public static void main(String[] args) {
		ListNode head=new ListNode(1);
		ListNode iterator=head;
		iterator.next=new ListNode(2);
		iterator=iterator.next;
		iterator.next=new ListNode(3);
		iterator=iterator.next;
		iterator.next=new ListNode(4);
		iterator=iterator.next;
		iterator.next=new ListNode(5);
		iterator=iterator.next;
		iterator.next=new ListNode(6);
		iterator=iterator.next;
		iterator.next=new ListNode(7);
		iterator=iterator.next;
		reorderList(head);
		while(head!=null)
		{
			System.out.println(head.val);
			head=head.next;
		}
	

	}

}

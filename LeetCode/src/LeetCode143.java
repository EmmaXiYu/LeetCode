import java.util.ArrayList;
import java.util.List;

public class LeetCode143 {
/*
 * Time limit exceed
 */
public static void reorderList(ListNode head) {
        
        
        if(head==null) return;
        else if(head.next==null) return;
        else if(head.next.next==null) return;
        else{
            
           ListNode startNode=head;
           ListNode startNodeNext=head.next;
          
           while(startNode.next!=null)
           {
               
           ListNode lastNode=getLastNode(startNode).get(0);
           ListNode preLastNode=getLastNode(startNode).get(1); 
           if(!lastNode.equals(startNodeNext)){
           preLastNode.next=null;
           startNode.next=lastNode;
           lastNode.next=startNodeNext;
           startNode=startNodeNext;
           startNodeNext=startNode.next;}
           else{
               break;
           }
           
           }
           
        }
        
    }
    
    public static List<ListNode> getLastNode(ListNode head)
    {
        if(head==null) return new ArrayList<>();
        else if(head.next==null) return new ArrayList<>();
        else{ListNode iterator=head.next;
        ListNode iteratorPre=head;
        while(iterator.next!=null) {
            iterator=iterator.next;
            iteratorPre=iteratorPre.next;
        }
        List<ListNode> list=new ArrayList<>();
        list.add(iterator);
        list.add(iteratorPre);
        return list;}
    }
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

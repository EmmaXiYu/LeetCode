
public class LeetCode203 {
	public ListNode removeElements(ListNode head, int val) {
        if(head==null) return null;
        else {
            while(head!=null&&head.val==val)
            head=head.next;
            if(head!=null){
            ListNode iterator=head.next;
            ListNode preElement =head;
            while(iterator!=null)
            {
                
                if(iterator.val==val)
                {
                    
                    ListNode afterElement=iterator.next;
                    preElement.next=afterElement;
                    iterator.next=null;
                    iterator=afterElement;
                }
                else {
                    iterator =iterator.next;
                    preElement=preElement.next;
                }
            }}
            return head;
            
        }}
}

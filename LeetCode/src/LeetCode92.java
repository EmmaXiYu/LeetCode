import java.util.ArrayList;
import java.util.List;

public class LeetCode92 {
	 public ListNode reverseBetween(ListNode head, int m, int n) {
	        if(head==null) return null;
	        else if(m==n) return head;
	        else{
	        int counter=1;
	        List<Integer> reverseArray=new ArrayList<>();
	        ListNode iterator=head;
	        ListNode beforeM=head;
	        while(counter<=n)
	        {
	            if(counter==m-1)
	            beforeM=iterator;
	            else if(counter>=m&&counter<=n)
	            reverseArray.add(iterator.val);
	            iterator=iterator.next;
	            counter++;
	        }
	        if(m>1){
	        for(int i=reverseArray.size()-1;i>=0;i--)
	        {
	            
	            beforeM.next=new ListNode(reverseArray.get(i));
	            beforeM=beforeM.next;
	           
	        }
	            beforeM.next=iterator;
	        }
	        else if (m==1)
	        {
	            head=new ListNode(reverseArray.get(reverseArray.size()-1));
	            ListNode ln=head;
	              for(int i=reverseArray.size()-2;i>=0;i--)
	        {
	            
	            ln.next=new ListNode(reverseArray.get(i));
	            ln=ln.next;
	           
	        }
	             ln.next=iterator; 
	        }
	            
	            return head;}
	    }
}

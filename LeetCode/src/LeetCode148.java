/*
 * Sort a linked list in O(n log n) time using constant space complexity.
 */
public class LeetCode148 {

	
	 public ListNode sortList(ListNode head) {
	        if(head==null) return null;
	        else{
	            ListNode iterator=head;
	            int counter=1;
	            boolean ifSorted=true;
	            while(iterator.next!=null)
	            {
	                if(iterator.val>iterator.next.val)
	                ifSorted=false;
	                iterator=iterator.next;
	                counter++;
	                
	            }
	            ListNode tail =iterator;
	            if(ifSorted) return head;
	            else
	            return sort_List(head,tail,counter);
	        }
	    }
	    public ListNode sort_List(ListNode head, ListNode tail, int listNum){
	        
	        if(listNum==1) 
	        {
	                head.next=null;
	            return head;
	        }
	        else{
	            ListNode newTail=head;
	            int counter=1;
	            while(counter<listNum/2)
	            {
	                newTail=newTail.next;
	                counter++;
	            }
	                 ListNode newHead=newTail.next;
	            ListNode frontSortedList=sort_List(head,newTail,counter);
	            ListNode rearSortedList=sort_List(newHead,tail,listNum-counter);
	            ListNode currentFrontList=frontSortedList;
	            ListNode currentRearList=rearSortedList;
	             ListNode returnHead=null;
	             ListNode returnHeadIterator=null;
	            if(currentFrontList.val<=currentRearList.val)
	           {returnHead=currentFrontList;
	            currentFrontList=currentFrontList.next;
	            returnHeadIterator=returnHead;
	           }
	            else {returnHead=currentRearList;
	                currentRearList=currentRearList.next;
	                returnHeadIterator=returnHead;
	            }
	            while(currentFrontList!=null&&currentRearList!=null)
	            {
	                if(currentFrontList.val<=currentRearList.val)
	                {
	                    returnHeadIterator.next=currentFrontList;
	                    returnHeadIterator=returnHeadIterator.next;
	                    currentFrontList=currentFrontList.next;
	                }
	                else
	                {
	                    returnHeadIterator.next=currentRearList;
	                    returnHeadIterator=returnHeadIterator.next;
	                    currentRearList=currentRearList.next;
	                }
	            }
	            while(currentFrontList!=null)
	            {
	                returnHeadIterator.next=currentFrontList;
	                    returnHeadIterator=returnHeadIterator.next;
	                    currentFrontList=currentFrontList.next;
	            }
	            while(currentRearList!=null)
	            {
	                returnHeadIterator.next=currentRearList;
	                    returnHeadIterator=returnHeadIterator.next;
	                    currentRearList=currentRearList.next;
	            }
	            
	            return returnHead;
	        }
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

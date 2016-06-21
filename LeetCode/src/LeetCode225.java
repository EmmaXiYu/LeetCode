import java.util.LinkedList;
import java.util.Queue;

public class LeetCode225 {

	 private Queue<Integer> queue;
	    public LeetCode225()
	    {
	        queue=new LinkedList<Integer>();
	    }
	    public void push(int x) {
	        queue.add(x);
	        
	    }

	    // Removes the element on top of the stack.
	    public void pop() {
	        Queue<Integer> temp=new LinkedList<Integer>();
	        int counter=0;
	        while(!queue.isEmpty()){
	        temp.add(queue.poll());
	        counter++;
	            
	        }
	        while(counter>1)
	        {
	        
	            queue.add(temp.poll());
	            counter--;
	        }
	        
	        
	    }

	    // Get the top element.
	    public int top() {
	        Queue<Integer> temp=new LinkedList<Integer>();
	        int counter=0;
	        while(!queue.isEmpty()){
	        temp.add(queue.poll());
	        counter++;
	            
	        }
	        while(counter>1)
	        {
	        
	            queue.add(temp.poll());
	            counter--;
	        }
	        int topInteger=temp.poll();
	        queue.add(topInteger);
	        return topInteger;
	        
	    }

	    // Return whether the stack is empty.
	    public boolean empty() {
	        return queue.isEmpty();
	        
	    }
}

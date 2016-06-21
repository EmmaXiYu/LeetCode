import java.util.Stack;

public class LeetCode232 {

	    // Push element x to the back of queue.
	    Stack<Integer> stack;
	    public LeetCode232()
	    {
	    stack=new Stack<Integer>();}
	    
	    public void push(int x) {
	        stack.push(x);
	        
	    }

	    // Removes the element from in front of queue.
	    public void pop() {
	        Stack<Integer> temp=new Stack<Integer>();
	        while(!stack.isEmpty()){
	       temp.push( stack.peek());
	            stack.pop();
	        }
	       temp.pop();
	       while(!temp.isEmpty())
	       {
	           stack.push(temp.peek());
	           temp.pop();
	       }
	    }

	    // Get the front element.
	    public int peek() {
	         Stack<Integer> temp=new Stack<Integer>();
	       while(!stack.isEmpty()){
	       temp.push( stack.peek());
	           stack.pop();
	       }
	       int frontInteger=temp.peek();
	       while(!temp.isEmpty())
	       {
	           stack.push(temp.peek());
	           temp.pop();
	       }
	       return frontInteger;
	    }

	    // Return whether the queue is empty.
	    public boolean empty() {
	        return stack.isEmpty();
	    }
	}


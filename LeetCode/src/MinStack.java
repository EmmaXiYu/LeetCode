import java.util.Stack;

public class MinStack {
	private Stack<int[]> stack;
	private int min;

	public MinStack() {
		stack = new Stack<>();
		min = 0;
	}

	public void push(int x) {
		int[] array = new int[2];
		if (stack.isEmpty()) {

			array[0] = x;
			array[1] = x;
		} else {

			array[0] = x;
			array[1] = Math.min(x, min);
		}
		min=array[1];
		stack.push(array);

	}

	public void pop() {
        stack.pop();
        
        min=stack.peek()[1];
	}

	public int top() {
		return stack.peek()[0];

	}

	public int getMin() {
		return stack.peek()[1];

	}
}


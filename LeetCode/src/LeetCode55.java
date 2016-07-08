import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LeetCode55 {
	
	/*
	 * Greedy Method
	 */
	 public boolean canJump2(int[] nums) {
	        int position=nums.length-1;
	        for(int i=nums.length-2;i>=0;i--)
	        {
	            if(nums[i]+i>=position)
	            position=i;
	        }
	        
	        if(position!=0)
	        return false;
	        else return true;
	    }
	/*
	 * Time limit Exceeded
	 */
	  public boolean canJump(int[] nums) {
          
	        Queue<Step> queue=new LinkedList<>();
	        Stack<Step> stack=new Stack<>();
	        queue.add(new Step(0,nums[0],nums[0]));
	        boolean ifCanJump=false;
	        int sum=0;
	        while(!queue.isEmpty()||!stack.isEmpty())
	        {
	            if(queue.isEmpty())
	            queue.add(stack.pop());
	            Step step=queue.poll();
	            if(step.currentValue==step.maxValue)
	            sum+=step.currentValue;
	            else if(step.currentValue<step.maxValue)
	            {
	                sum-=(step.currentValue+1);
	                sum+=step.currentValue;}
	            if(sum>=nums.length-1)
	            {
	                ifCanJump=true;
	                break;
	            }
	            if(step.currentValue>0){
	            Step newStep=new Step(step.positionInNums,step.currentValue-1,step.maxValue);
	            stack.push(newStep);
	            queue.add(new Step(sum,nums[sum],nums[sum]));}
	        }
	        return ifCanJump;
	    }
}

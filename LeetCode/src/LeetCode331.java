import java.util.Stack;
import java.util.StringTokenizer;

public class LeetCode331 {
	public class Solution {
		  public boolean isValidSerialization(String preorder) {
				 if(preorder==null||preorder.length()==0) return true;
			        Stack<String> stack=new Stack<>();
			        StringBuilder sb=new StringBuilder();
			        for(int i=0;i<preorder.length();i++)
			        {
			        	sb.append(preorder.substring(i,i+1));
			        }
			        sb.reverse();
			        String s=sb.toString();
			        StringTokenizer sk=new StringTokenizer(s, ",");
			        while(sk.hasMoreTokens())
			        {
			        	String token=sk.nextToken();
			        	if(token.equals("#"))
			        		stack.push(token);
			        	else 
			        	{
			        		if(stack.size()<2) return false;
			        		else {
			        	    String first=stack.pop();
			        	    String second=stack.pop();
			        	    if(first.equals("#")&&second.equals("#"))
			        	    	{
			        	    	    stack.push("#");
			        	    	    
			        	    	}
			        	    else return false;
			        	   }
			        	}
			        }
			        if(stack.size()>1) return false ;
			      return true;
			     }
}}

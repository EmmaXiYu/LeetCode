import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class LeetCode227 {
	/*
	 *Time limit exceed
	 */
	 public int calculate(String s) {
	       
	       List<Integer> intList=new ArrayList<>();
	       List<String> op=new ArrayList<>();
	       StringTokenizer st=new StringTokenizer(s, "*/+- ");
	       
	       while(st.hasMoreTokens())
	       {
	    	   intList.add(Integer.parseInt(st.nextToken()));
	       }
	       int i=0;
	       while(i<s.length())
	       {
	    	   if(s.substring(i,i+1).equals("+")||s.substring(i,i+1).equals("-")||
	    			   s.substring(i,i+1).equals("*")||
	    			   s.substring(i,i+1).equals("/"))
	    		   op.add(s.substring(i,i+1));
	    	   i++;
	       }
	       int opCounter=0;
	       while(opCounter<op.size())
	       {
	    	   if(op.get(opCounter).equals("*")||op.get(opCounter).equals("/"))
	    	   { 
	    		   int num1=intList.get(opCounter);
	    		   int num2=intList.get(opCounter+1);
	    		   int result=0;
	    		   if(op.get(opCounter).equals("*"))
	    			   result=num1*num2;
	    		   else result=num1/num2;
	    		   intList.remove(opCounter);
	    		   intList.remove(opCounter);
	    		   intList.add(opCounter,result);
	    		   op.remove(opCounter);
	    	   }
	    	   else opCounter++;
	       }
	       while(!op.isEmpty())
	       {
	    	   int num1=intList.get(0);
    		   int num2=intList.get(1);
    		   int result=0;
    		   if(op.get(0).equals("+"))
    			   result=num1+num2;
    		   else result=num1-num2;
    		   intList.remove(0);
    		   intList.remove(0);
    		   intList.add(0,result);
    		   op.remove(0);
	       }
	       return intList.get(0);
	    }
	
	/*
	 * Very slow and need to be careful of the order of stack
	 */
//	 public int calculate(String s) {
//	        
//	        Stack<String> stack1=new Stack<>();
//	        
//	        int i=0;
//	        while(i<s.length())
//	        {
//	             if(s.substring(i,i+1).equals("+")||s.substring(i,i+1).equals("-"))
//	            { stack1.push(s.substring(i,i+1));
//	             i++;
//	            }
//	             else if (s.substring(i,i+1).equals(" "))
//	             i++;
//	             else if (s.substring(i,i+1).equals("0")||s.substring(i,i+1).equals("1")||s.substring(i,i+1).equals("2")||s.substring(i,i+1).equals("3")||s.substring(i,i+1).equals("4")||s.substring(i,i+1).equals("5")||s.substring(i,i+1).equals("6")||s.substring(i,i+1).equals("7")||s.substring(i,i+1).equals("8")||s.substring(i,i+1).equals("9"))
//	             {
//	                 StringBuilder sb=new StringBuilder();
//	                 sb.append(s.substring(i,i+1));
//	                 i++;
//	                 while(i<s.length()&&(s.substring(i,i+1).equals("0")||s.substring(i,i+1).equals("1")||s.substring(i,i+1).equals("2")||s.substring(i,i+1).equals("3")||s.substring(i,i+1).equals("4")||s.substring(i,i+1).equals("5")||s.substring(i,i+1).equals("6")||s.substring(i,i+1).equals("7")||s.substring(i,i+1).equals("8")||s.substring(i,i+1).equals("9")))
//	                 {
//	                     sb.append(s.substring(i,i+1));
//	                     i++;
//	                 }
//	                 
//	                 stack1.push(sb.toString());
//	             }
//	             else if (s.substring(i,i+1).equals("*")||s.substring(i,i+1).equals("/"))
//	             {
//	               int num1=Integer.parseInt(stack1.pop());
//	               String op=s.substring(i,i+1);
//	               i++;
//	               StringBuilder sb=new StringBuilder();
//	                while(i<s.length()&&(s.substring(i,i+1).equals("0")||s.substring(i,i+1).equals("1")||s.substring(i,i+1).equals("2")||s.substring(i,i+1).equals("3")||s.substring(i,i+1).equals("4")||s.substring(i,i+1).equals("5")||s.substring(i,i+1).equals("6")||s.substring(i,i+1).equals("7")||s.substring(i,i+1).equals("8")||s.substring(i,i+1).equals("9")||s.substring(i,i+1).equals(" ")))
//	                 {
//	                	if(!s.substring(i,i+1).equals(" "))
//	                     sb.append(s.substring(i,i+1));
//	                     i++;
//	                 }
//	                 int num2=Integer.parseInt(sb.toString());
//	                 int result=0;
//	                 if(op.equals("*"))
//	                 result=num1*num2;
//	                 else 
//	                 result=num1/num2;
//	                 stack1.push(result+"");
//	                
//	             }
//	             
//	            
//	        }
//	        Stack<String> stack2=new Stack<>();
//	        while(!stack1.isEmpty())
//	        	stack2.push(stack1.pop());
//	        while(stack2.size()>2)
//	        {
//	            int num1=Integer.parseInt(stack2.pop());
//	            String op=stack2.pop();
//	            int num2=Integer.parseInt(stack2.pop());
//	            int result=0;
//	             if(op.equals("+"))
//	                 result=num1+num2;
//	                 else 
//	                 result=num1-num2;
//	             stack2.push(result+"");
//	            
//	        }
//	       return Integer.parseInt(stack2.pop());
//	    }
	public static void main(String[] args) {
		LeetCode227 obj=new LeetCode227();
		System.out.println(obj.calculate("1+1-1"));

	}

}

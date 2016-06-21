import java.util.Stack;

public class LeetCode20 {
	  public static boolean isValid(String s) {
	        
	        if(s==null||s.length()==0) return true;
	        else{
	        boolean ifValid=true;
	         Stack<String> stack=new Stack<String>();
	         for(int i=0;i<s.length();i++)
	         {
	             if(s.substring(i,i+1).equals("(")||s.substring(i,i+1).equals("[")||s.substring(i,i+1).equals("{"))
	             {
	                 stack.push(s.substring(i,i+1));
	                 
	             }
	             else if(s.substring(i,i+1).equals(")")||s.substring(i,i+1).equals("]")||s.substring(i,i+1).equals("}"))
	             
	                { 
	                    if(!stack.isEmpty()){
	                    
	                    String pop=stack.pop();
	                    String compare=s.substring(i,i+1);
	                    
	                    if(pop.equals("(")&&!compare.equals(")"))
	                    {
	                    	ifValid=false;
		                    break;
	                    }
	                    else if (pop.equals("[")&&!compare.equals("]"))
	                    {
	                    	ifValid=false;
		                    break;
	                    }
	                    else if (pop.equals("{")&&!compare.equals("}"))
	                    {
	                    	ifValid=false;
		                    break;
	                    }
	                        
	                    }
	                else {ifValid=false;break;}
	                }
	             
	         }
	         if(!stack.isEmpty())
	         ifValid=false;
	         return ifValid;
	        }}
	  
	  
	public static void main(String[] args) {
		
		System.out.println(isValid("()"));
	}

}

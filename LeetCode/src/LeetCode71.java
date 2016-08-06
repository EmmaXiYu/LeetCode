import java.util.Stack;

public class LeetCode71 {

	 public String simplifyPath(String path) {
		    if(path==null||path.length()==0) return "";
		    if(path.length()==1) return path;
		     Stack<String> stack=new Stack<>();
		     for(int i=0;i<path.length();i++)
		     {
		    if(!path.substring(i,i+1).equals("/")&&!path.substring(i,i+1).equals("."))
		    stack.push(path.substring(i,i+1));  
		    /*
		     *   "/"
		     */
		    else if(path.substring(i,i+1).equals("/")&&stack.isEmpty())
		     stack.push(path.substring(i,i+1));
		    /*
		     * "///"->"/" or "/home//folder"->"/home/folder"
		     */
		       else if(path.substring(i,i+1).equals("/")&&!stack.peek().equals("/"))
		      stack.push(path.substring(i,i+1));
		    
		    /*
		     * "/.b"->"/.b"
		     */
		      else if(path.substring(i,i+1).equals(".")&&(i+1<path.length()-1)&&!path.substring(i+1,i+2).equals(".")&&!path.substring(i+1,i+2).equals("/"))
		         {
		            
		            stack.push(".");
		          
		          
		             
		             
		         }
		    /*
		     * "/..hidden"->"/..hidden"
		     */
		         else if(path.substring(i,i+1).equals(".")&&(i+1<path.length()-1)&&path.substring(i+1,i+2).equals(".")&&!path.substring(i+2,i+3).equals("/"))
		         {
		       
		            stack.push(".");
		          stack.push(".");
		             i++;
		         }
		    /*
		     * "/..."->"/..."
		     */
		         else if(path.substring(i,i+1).equals(".")&&i-1>0&&path.substring(i-1,i).equals("."))
		         {
		               stack.push(path.substring(i,i+1));
		         }
		    /*
		     * "/../"->""
		     * "/a/b/../../c"->"/c"
		     */
		          else if(path.substring(i,i+1).equals(".")&&(i+2<path.length())&&path.substring(i+1,i+2).equals(".")&&path.substring(i+2,i+3).equals("/"))
		         {
		        	  if(stack.size()>1&&stack.pop().equals("/"))stack.pop();
		           while(!stack.peek().equals("/"))
		                 {stack.pop();}
		                 
		                 
		             i++;
		             
		         }
		    /*
		     * "/a/b/../../c/.."->"/"
		     */
		         else if(path.substring(i,i+1).equals(".")&&(i+1<path.length())&&path.substring(i+1,i+2).equals("."))
		         {
		        	 if(stack.size()>1&&stack.pop().equals("/"))stack.pop();
			            	while(!stack.peek().equals("/"))
			                 {stack.pop();}
			               
			             
		             
		             i++;
		             
		         }
		   
		      
		     }
		   
		      StringBuilder sb=new StringBuilder();
		     
		     Stack<String> newStack=new Stack<>();
		     while(!stack.isEmpty())
		     {
		         newStack.push(stack.pop());
		     }
		     while(newStack.size()>1)
		     {
		        
		      
		          sb.append(newStack.pop());
		         
		     }
		    
		    if(sb.toString().equals(""))
		    sb.append(newStack.pop());
		     else if(!sb.toString().equals("")&&!newStack.peek().equals("/"))
		     sb.append(newStack.pop());
		     return sb.toString();
	}
	    
	    
    
	public static void main(String[] args) {
		LeetCode71 obj=new LeetCode71();
		System.out.println(obj.simplifyPath("/home/../../.."));

	}

}

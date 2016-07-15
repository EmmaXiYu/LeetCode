import java.util.ArrayList;
import java.util.List;

public class LeetCode22 {
	public List<String> generateParenthesis(int n) {
	      
	      if(n<=0) return new ArrayList<>();
	      List<String> result=new ArrayList<>();
	      char[] charList=new char[n*2];
	      buildString(result, charList, 0,  n,  0);
	      return result;
	      
	    }
	    
	    public void buildString(List<String> result, char[] charList,int counter, int openNum, int closeNum)
	    {
	        if(counter==charList.length)
	        { 
	            result.add(String.valueOf(charList));
	            return ;
	            
	        }
	        if(openNum>0)
	        {
	            charList[counter]='(';
	           buildString( result, charList, counter+1, openNum-1,  closeNum+1);
	        }
	         if(closeNum>0)
	        {
	            charList[counter]=')';
	           buildString( result, charList, counter+1, openNum,  closeNum-1);
	        }
	        
	    }
}

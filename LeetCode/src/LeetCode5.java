import java.util.ArrayList;
import java.util.List;

public class LeetCode5 {
	/*
	 * Time limit exceeded
	 */
//	 public String longestPalindrome(String s) {
//         if(s==null||s.length()==0)return "";
//	      int start=0;
//	      int end=0;
//	      String lp=s.substring(0,1);
//
//	      boolean newStart=false;
//	      int backPlace=0;
//	      for(int i=1;i<s.length();i++)
//	      {
//	          if(!newStart&&s.substring(i,i+1).equals(s.substring(i-1,i)))
//	          {
//	              start=i-1;
//	              end =i;
//	              backPlace=i;
//	              if(end-start+1>lp.length())
//	 	             lp=s.substring(start,end+1);
//	              newStart=true;
//	          }
//	        
//	          else if (newStart&&start-1>-1&&s.substring(i,i+1).equals(s.substring(start-1,start)))
//	          {
//	              start--;
//	              end=i;
//	              if(i==s.length()-1)
//	              {
//	            	  if(end-start+1>lp.length())
//	 	 	             lp=s.substring(start,end+1);
//	              }
//	          }
//	           else if (newStart&&start-1<0)
//	          {
//	             if(end-start+1>lp.length())
//	             lp=s.substring(start,end+1);
//	            newStart=false;
//	            i=backPlace;
//	          }
//	            else if (newStart&&start-1>-1&&!s.substring(i,i+1).equals(s.substring(start-1,start)))
//	          {
//	             if(end-start+1>lp.length())
//	             lp=s.substring(start,end+1);
//	            newStart=false;
//	            i=backPlace;
//	          }}
//	      newStart=false;
//	      backPlace=0;
//	      int i=0;
//	         for(i=2;i<s.length();i++)
//	      {
//	          if(!newStart&&s.substring(i,i+1).equals(s.substring(i-2,i-1)))
//	          {
//	              start=i-2;
//	              end =i;
//	              backPlace=i;
//	              if(end-start+1>lp.length())
//	 	             lp=s.substring(start,end+1);
//	              newStart=true;
//	          }
//	        
//	          else if (newStart&&start-1>-1&&s.substring(i,i+1).equals(s.substring(start-1,start)))
//	          {
//	              start--;
//	              end=i;
//	              if(i==s.length()-1)
//	              {
//	            	  if(end-start+1>lp.length())
//	 	 	             lp=s.substring(start,end+1);
//	              }
//	          }
//	           else if (newStart&&start-1<0)
//	          {
//	             if(end-start+1>lp.length())
//	             lp=s.substring(start,end+1);
//	            newStart=false;
//	            i=backPlace;
//	          }
//	            else if (newStart&&start-1>-1&&!s.substring(i,i+1).equals(s.substring(start-1,start)))
//	          {
//	             if(end-start+1>lp.length())
//	             lp=s.substring(start,end+1);
//	            newStart=false;
//	            i=backPlace;
//	          }
//	      }
//	      return lp;
//	    }   
	/*
	 * Time limit exceeded
	 */
//	  public String longestPalindrome(String s) {
//	        if(s==null||s.length()==0)return "";
//	        if(s.length()==1) return s;
//	        List<Integer> checkList1=new ArrayList<>();
//	        List<Integer> checkList2=new ArrayList<>();
//	        for(int i=0;i<s.length()-1;i++)
//	        {
//	            if(s.substring(i,i+1).equals(s.substring(i+1,i+2)))
//	            checkList1.add(i);
//	        }
//	        if(s.length()>=3){
//	         for(int i=1;i<s.length()-1;i++)
//	        {
//	            if(s.substring(i-1,i).equals(s.substring(i+1,i+2)))
//	            checkList2.add(i);
//	        }}
//	        String resultString="";
//	        int resultStringLength=0;
//	        String tempString="";
//	        int tempStringLength=0;
//	        for(int i=0;i<checkList1.size();i++)
//	        {
//	            if(tempStringLength>resultStringLength)
//	            {resultString=tempString;
//	            resultStringLength=resultString.length();}
//	            tempString="";
//	            tempStringLength=0;
//	            int f=checkList1.get(i);
//	            int se=f+1;
//	            while(f>=0&&se<s.length())
//	            {
//	                if(s.substring(f,f+1).equals(s.substring(se,se+1)))
//	                {
//	                tempString=s.substring(f,se+1);
//	                tempStringLength=tempString.length();
//	                f--;
//	                se++;
//	                }
//	                else break;
//	            }
//	        } if(tempStringLength>resultStringLength)
//	        {
//	            		resultString=tempString;
//	            resultStringLength=resultString.length();}
//	        tempString="";
//	        tempStringLength=0;
//	        for(int i=0;i<checkList2.size();i++)
//	        {
//	            if(tempStringLength>resultStringLength)
//	            {resultString=tempString;
//	            
//	            resultStringLength=resultString.length();
//	            }
//	             tempString="";
//	            tempStringLength=0;
//	            int f=checkList2.get(i)-1;
//	            int se=checkList2.get(i)+1;
//	            while(f>=0&&se<s.length())
//	            {
//	                if(s.substring(f,f+1).equals(s.substring(se,se+1)))
//	                {
//	                tempString=s.substring(f,se+1);
//	                tempStringLength=tempString.length();
//	                f--;
//	                se++;
//	                }
//	                else break;
//	            }
//	        } if(tempStringLength>resultStringLength)
//	        { resultString=tempString;
//	        resultStringLength=resultString.length();}
//	        return resultString;
//	    }
	public static void main(String[] args) {
		LeetCode5 obj=new LeetCode5();
	   // System.out.println(obj.longestPalindrome("aaaa"));
	   // System.out.println(obj.longestPalindrome("abcba"));
		String ori="abababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababa";
	System.out.println(ori.length());
	//	String s= obj.longestPalindrome("abababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababa");
	// System.out.println(s.length());
	 String comp="abababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababa";
	 System.out.println(comp.length());
	 
	 
	 //System.out.println(obj.longestPalindrome("a"));
		//System.out.println(obj.longestPalindrome("ccc"));
	}

}

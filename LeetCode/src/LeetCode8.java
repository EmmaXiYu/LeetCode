
public class LeetCode8 {
	/*
	 * Requirements for atoi:
The function first discards as many whitespace characters as necessary until the first non-whitespace character is found. Then, starting from this character, takes an optional initial plus or minus sign followed by as many numerical digits as possible, and interprets them as a numerical value.

The string can contain additional characters after those that form the integral number, which are ignored and have no effect on the behavior of this function.

If the first sequence of non-whitespace characters in str is not a valid integral number, or if no such sequence exists because either str is empty or it contains only whitespace characters, no conversion is performed.

If no valid conversion could be performed, a zero value is returned. If the correct value is out of the range of representable values, INT_MAX (2147483647) or INT_MIN (-2147483648) is returned.
	 */
	/*
	 * "+-2" output =0
	 */
	 public int myAtoi(String str) {
	        
	        char[] charArray=str.toCharArray();
	        int start = findTheValidStartPoint(  charArray);
	        if(start>charArray.length-1) return 0;
	        char sign=' ';
	        StringBuilder sb=new StringBuilder();
	        for(int i=start;i<charArray.length;i++)
	        {
	        	 if(sign==' ' && charArray[i]=='+')
	     	        sign='+';
	     	     else if(sign==' ' &&charArray[i]=='-')
	     	        sign='-';
	     	     else if(charArray[i]=='1'||charArray[i]=='2'||charArray[i]=='3'||charArray[i]=='4'||charArray[i]=='5'||
	     	            charArray[i]=='6'||charArray[i]=='7'||charArray[i]=='8'||charArray[i]=='9'||charArray[i]=='0')
                  sb.append(charArray[i]);
                  else if(sb.length()!=0)
                  
                	  break;
                  
                  else   return 0;
	        	 
	        }
	        
	        String stringValue=sb.toString();
	        char[] valueArray=stringValue.toCharArray();
	        long multiplier=1;// int will excess int limitation, so multiplier should be long
	        int sum=0;
	        if(sign!='-')
	        	sign='+';
	        for(int i=0;i<valueArray.length;i++)
	        {
	            Long currentV=Long.parseLong((valueArray[valueArray.length-1-i]+""))*multiplier;
	            if(currentV>Integer.MAX_VALUE && sign=='+' )
	            	return Integer.MAX_VALUE;
	            else if (currentV>Integer.MAX_VALUE && sign=='-')
	            	return Integer.MIN_VALUE;
	            else if( Integer.MAX_VALUE-sum<currentV&& sign=='+')
	        	   return Integer.MAX_VALUE;
	           else if ( Integer.MAX_VALUE-sum<currentV&& sign=='-')
	        	   return Integer.MIN_VALUE;
	           else {sum+=currentV;
	            multiplier*=10;}
	        }
	        if(sign=='-')
	        return -sum;
	        else
	        	return sum;
	    }
	    
	    public int findTheValidStartPoint( char[] charArray)
	    {
	        int counter=0;
	        while(counter<charArray.length && charArray[counter]==' ')
	           {
	               
	               counter++;
	           }
	           return counter;
	    }
	    
	    public static void main(String[] args)
	    {
	    	LeetCode8 lc8=new LeetCode8();
	    	System.out.println(lc8.myAtoi("    10522545459"));
	    }
}

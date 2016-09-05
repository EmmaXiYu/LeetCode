
public class LeetCode338 {

	/*
	 * Dynamic programing is T(n)=n, S(n)=n;
	 */
	  public int[] countBits(int num) {
	        
	        if(num==0)
	        {
	            int [] returnArray=new int [1];
	            returnArray[0]=0;
	            return returnArray;
	        }
	        
	        int [] returnArray=new int [num+1];
	        returnArray[0]=0;
	        returnArray[1]=1;
	        int nextCompareNum=2;
	        int quotient=0;
	        int quotientNum=0;
	        for(int i=2;i<=num;i++)
	        {    
	            if(i==nextCompareNum)
	           { nextCompareNum*=2;
	              returnArray[i]=1; 
	           }
	       
	           else if(i<nextCompareNum)
	           {
	                quotient=i/(nextCompareNum/2);
	                if(quotient!=0) 
	                	 quotientNum=1;
	            int mod=i % (nextCompareNum/2);
	    
	            returnArray[i]=returnArray[mod]+quotientNum;
	           }
	           
	            
	        }
	        return returnArray;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

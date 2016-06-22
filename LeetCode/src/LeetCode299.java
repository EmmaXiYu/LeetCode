import java.util.HashMap;

public class LeetCode299 {

    public static String getHint(String secret, String guess) {
    	char[] secretArray=secret.toCharArray();
    	char[] guessArray=guess.toCharArray();
    
    	int bullNumber=0;
    	int cowNumber=0;
    	for(int i=0;i<secretArray.length;i++)
    	{
    	    if(secretArray[i]==guessArray[i])
    	    {  secretArray[i]='A';
    	        bullNumber++;
    	    }
    	    else {
    	        for(int j=0;j<guessArray.length;j++)
    			{
    				if(secretArray[j]==guessArray[i]&&guessArray[j]!=secretArray[j])
    					{secretArray[j]='B';
    						cowNumber++;
    					break;}
    			}
    	    }
    		
    		
    	}
    	
    	String result=bullNumber+"A"+cowNumber+"B";
    	return result;
    }
	public static void main(String[] args) {
	String s="1122";
	String g="1222";
	System.out.println(getHint(s,g));

	}

}

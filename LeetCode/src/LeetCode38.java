
public class LeetCode38 {
	public static String countAndSay(int n) {
        if(n==1) return "1";
        else{
        	String s=countAndSay(n-1);
        	return nextLevelString(s);
        }
   }
	public static String nextLevelString(String integerString)
	{
		
        String currentNum=integerString.substring(0,1);
        int currentNumRepeatTime=1;
        String returnString="";
        if(integerString.length()==1){
        	returnString="1"+currentNum;
        	}
        else{
        for(int i=1;i<integerString.length();i++)
        {
        	if(currentNum.equals(integerString.substring(i,i+1)))
        	{
        		currentNumRepeatTime++;
        	}
        	else {
        		returnString+=Integer.toString(currentNumRepeatTime)+currentNum;
        		currentNum=integerString.substring(i,i+1);
        		currentNumRepeatTime=1;
        	}
        	
        	
        }
        returnString+=Integer.toString(currentNumRepeatTime)+currentNum;}
        return returnString;}
        
	public static void main(String[] args) {
		int test=6;
		System.out.println(countAndSay(test));

	}

}

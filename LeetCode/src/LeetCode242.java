import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class LeetCode242 {

	 public static  boolean isAnagram(String s, String t) {
	       
		char[] sCharArray=s.toCharArray();
		char[] tCharArray=t.toCharArray();
		if(sCharArray.length!=tCharArray.length)
		{
			return false;
		}
		else{
		Arrays.sort(sCharArray);
		Arrays.sort(tCharArray);
		for(int i=0;i<sCharArray.length;i++)
		{
			
		if(sCharArray[i]!=tCharArray[i])
		{
			return false;
		}
		
		 
	    }
		return true;
		}
}
	 
	 
	 public static void main(String[] args)
	 {
		 String one="a";
		 String two="b";
		 System.out.println(isAnagram(one,two));
	 }
}
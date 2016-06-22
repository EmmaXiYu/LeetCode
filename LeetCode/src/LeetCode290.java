
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class LeetCode290 {

	/* pattern = "abba", str = "dog cat cat dog" should return true.
       pattern = "abba", str = "dog cat cat fish" should return false.
       pattern = "aaaa", str = "dog cat cat dog" should return false.
       pattern = "abba", str = "dog dog dog dog" should return false.
	 */
	
	 public static  boolean wordPattern(String pattern, String str) {
	        
		
		 char[] patternArray=pattern.toCharArray();
		 String [] strArray=str.split(" ");
		 if(patternArray.length!=strArray.length)
			 return false;
		 else {
		 HashMap<Character, String> hm=new HashMap<>();
		 for(int i=0;i<patternArray.length;i++)
		 {
           if(!hm.containsKey(patternArray[i])&&!hm.containsValue(strArray[i]))
           {
        	   hm.put(patternArray[i],strArray[i]);
           }
           else if (!hm.containsKey(patternArray[i])&&hm.containsValue(strArray[i]))
           {
        	   return false ;
           }
           else if (hm.containsKey(patternArray[i])&&!hm.containsValue(strArray[i])){
        	   if(!hm.get(patternArray[i]).toString().equals(strArray[i]))
        		   return false ;
        	   }
           }
		 return true;
		 }
		 }

	
	public static void main(String[] args) {
		String pattern="abba";
		String str="dog dog dog dog";
		System.out.println(wordPattern(pattern, str));

	}

}

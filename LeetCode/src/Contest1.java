import java.util.HashMap;

public class Contest1 {
	 public char findTheDifference(String s, String t) {
	        HashMap<Character,Integer> hm=new HashMap<>();
	        char[] charArray=s.toCharArray();
	        for(int i=0;i<charArray.length;i++)
	        {
	           if(hm.containsKey(charArray[i]))
	        		   {
	        	     int num=hm.get(charArray[i]);
	        	      num=num+1;
	        	     hm.put(charArray[i], num);
	        	     }
	           else {
	        	   
	        	   hm.put(charArray[i], 1);
	           }
	        }
	        char[] charArray2=t.toCharArray();
	        for(int i=0;i<charArray2.length;i++)
	        {
	        	if(hm.containsKey(charArray2[i]))
	        			{
	        		
	        		 int num=hm.get(charArray2[i]);
	        		 if(num==0)
	        			 return charArray2[i];
	        		 hm.put(charArray2[i], num-1);
	        			}
	        	
	        	else 
	        	{
	        		return charArray2[i];
	        	}
	        }
	        
	    
	 return ' ';
	 
	 }
	 
	 public static void main(String[] args)
	 {
		 Contest1 obj=new Contest1();
		 System.out.println(obj.findTheDifference("aabbcddeff", "fabcdefabda"));
	 }
}

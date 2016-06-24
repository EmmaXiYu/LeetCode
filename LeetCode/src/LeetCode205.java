import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class LeetCode205 {

	
	 public static boolean isIsomorphic(String s, String t) {
	        
		 HashMap<String, List<Integer>> hms=new HashMap<>();
		 HashMap<String, List<Integer>> hmt=new HashMap<>();
		 for(int i=0;i<s.length();i++)
		 {
			 if(!hms.containsKey(s.substring(i,i+1)))
			 {
				 List<Integer> l=new ArrayList<>();
				 l.add(i);
				 hms.put(s.substring(i,i+1), l);
			 }
			 else if (hms.containsKey(s.substring(i,i+1))){
				 List<Integer> l=hms.get(s.substring(i,i+1));
				 l.add(i);
				 hms.put(s.substring(i,i+1),l);
				 
			 }
			 if(!hmt.containsKey(t.substring(i,i+1)))
			 {
				 List<Integer> l=new ArrayList<>();
				 l.add(i);
				 hmt.put(t.substring(i,i+1), l);
			 }
			 else if (hmt.containsKey(t.substring(i,i+1))){
				 List<Integer> l=hmt.get(t.substring(i,i+1));
				 l.add(i);
				 hmt.put(t.substring(i,i+1),l);
				 
			 }
			}
		 if(hms.size()!=hmt.size()) return false;
		 Iterator<Map.Entry<String, List<Integer>>> iterator=hms.entrySet().iterator();
		 char[] sCharArray=new char[s.length()];
		 while(iterator.hasNext())
		 {
               List<Integer> l= iterator.next().getValue();
               for(int i=0;i<l.size();i++)
               {
            	   sCharArray[l.get(i)]=t.charAt(l.get(i));
               }
		 }
		for(int i=0;i<sCharArray.length;i++)
		{
			if(sCharArray[i]!=t.charAt(i))
				return false;
		}
		 
		 return true;
	    }
	public static void main(String[] args) {
		String one="egg";
		String two="add";
		System.out.println(isIsomorphic(one, two));
		one ="ab";
		two="aa";
		System.out.println(isIsomorphic(one, two));

	}

}

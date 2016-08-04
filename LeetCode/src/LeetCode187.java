import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LeetCode187 {
	  public List<String> findRepeatedDnaSequences(String s) {
	        if(s==null) return new ArrayList<>();
	        HashMap<String, Integer> hm=new HashMap<>();
	        for(int i=0;i<s.length()-9;i++){
	           String sub=s.substring(i,i+10);
	           if(hm.containsKey(sub))
	           {
	               hm.put(sub,hm.get(sub)+1);
	           }
	           else hm.put(sub,1);
	        }
	        List<String> l=new ArrayList<>();
	        for(String key:hm.keySet())
	        {
	            if(hm.get(key)>1)
	          l.add(key);  
	        }
	        return l;
	    }
	  
	  public static void main(String[] args)
	  {
		  LeetCode187 obj=new LeetCode187();
		  String s="AAAAAAAAAAA";
		 List<String> l= obj.findRepeatedDnaSequences(s);
		 for(int i=0;i<l.size();i++)
		 {
			 System.out.println(l.get(i));
		 }
	  }
}

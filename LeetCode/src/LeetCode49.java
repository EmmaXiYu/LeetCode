import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class LeetCode49 {
	public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null||strs.length==0)
        return new ArrayList<>();
        List<List<String>> ll=new ArrayList<>();
         HashMap<String,List<Integer>> hm=new HashMap<>();
        for(int i=0;i<strs.length;i++)
        {
            char [] c=strs[i].toCharArray();
            Arrays.sort(c);
            String s= String.valueOf(c);//Remember this 
            if(hm.containsKey(s))
            {
                hm.get(s).add(i);
            }
            else {
            	List<Integer> lOfInteger=new ArrayList<>();
            	lOfInteger.add(i);
            	hm.put(s, lOfInteger);
            }
            
        }
        for(String key:  hm.keySet())
        {
        	List<Integer> list=hm.get(key);
        	List<String> listOfString=new ArrayList<>();
        	for(int i:list)
        	{
        		listOfString.add(strs[i]);
        	}
        	ll.add(listOfString);
        }
        return ll;
    }
	public static void main(String[] args) {
		
		LeetCode49 obj=new LeetCode49();
		String [] strs={""};
		System.out.println(obj.groupAnagrams(strs));
	}

}

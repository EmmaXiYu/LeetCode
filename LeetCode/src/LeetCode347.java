import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Set;


public class LeetCode347{
	public List<Integer> topKFrequent(int[] nums, int k) {
		  HashMap<Integer, Integer> hm=new HashMap<>();
		  for(int i=0;i<nums.length;i++)
		  {
			  if(hm.containsKey(nums[i]))
			  {
				  int fre=(int)hm.get(nums[i]);
				  hm.put(nums[i],fre+1);
			  }
			  else 
			  {
				  hm.put(nums[i],1);
			  }
		  }
		  Comparator<Frequency> comparator = new FrequenceComparator();
		  PriorityQueue <Frequency>pq=new PriorityQueue<Frequency>(nums.length, comparator);
		  
		  for (int key : hm.keySet()) {
			  Frequency frequnece=new Frequency(key,hm.get(key));
			  pq.add(frequnece);
		  }
		  
		
		  List<Integer> list=new ArrayList<>();
		 for(int i=0;i<k;i++)
		 {
			 list.add(pq.poll().getValue());
		 }
		 return list;
	  }
	  
	  
     public static void main(String[] args)
     {
    	 int[] nums={1,1,1,1,2,2,3};
    	 LeetCode347 obj=new LeetCode347();
    	 List<Integer> l=obj.topKFrequent(nums, 2);
    	 for(int i=0; i<l.size();i++)
    	 {
    		 System.out.println(l.get(i));
    	 }
     }
	
}

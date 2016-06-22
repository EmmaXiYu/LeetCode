import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class LeetCode350 {

	 public static int[] intersection(int[] nums1, int[] nums2) {
	        
	        HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();
	        List<Integer> interSectionList=new ArrayList<>();
	        for(int i=0;i<nums1.length;i++)
	        {
	        	if(hs.containsKey(nums1[i]))
	        	{
	        		int counter=hs.get(nums1[i]);
	        		hs.put(nums1[i],counter+1);
	        	}
	        	else hs.put(nums1[i],1);
	        	
	        }
	        for(int i=0;i<nums2.length;i++)
	        {
	        	if(hs.containsKey(nums2[i])&&hs.get(nums2[i])>0)
	        		{
	        		interSectionList.add(nums2[i]);
	        		int counter=hs.get(nums2[i]);
	        		hs.put(nums2[i], --counter);
	        		}
	        		
	        }
	        int [] result=new int[interSectionList.size()];
	        for(int i=0;i<result.length;i++)
	        {
	        	result[i] =interSectionList.get(i);
	        }
	       
	        return result;
	    }
	
	public static void main(String[] args) {
	
		int [] nums1={1,2,2,1};
		int [] nums2={2,2};
		int [] result=intersection(nums1,nums2);
		for(int i=0;i<result.length;i++)
		{
			System.out.print(result[i]);
		}
	}

}

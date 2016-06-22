import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class LeetCode349 {

	 public static int[] intersection(int[] nums1, int[] nums2) {
	        
	        HashSet<Integer> hs=new HashSet<>();
	        List<Integer> interSectionList=new ArrayList<>();
	        for(int i=0;i<nums1.length;i++)
	        {
	        	hs.add(nums1[i]);
	        }
	        for(int i=0;i<nums2.length;i++)
	        {
	        	if(hs.contains(nums2[i]))
	        		{interSectionList.add(nums2[i]);
	        		hs.remove(nums2[i]);
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

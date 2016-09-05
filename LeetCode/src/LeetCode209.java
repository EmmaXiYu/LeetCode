import java.util.ArrayList;
import java.util.List;

public class LeetCode209 {
	
	/*
	 * Time limit exceeded recursively
	 */
//	
//	 public int minSubArrayLen(int s, int[] nums) {
//	        if(nums==null||nums.length==0) return 0;
//	        int r=min_subarray_len(s, nums,  0, nums.length);
//	      if(r==-1)
//	      return 0;
//	      else return r;
//	        
//	     }
//	     
//	    public int min_subarray_len(int s, int[] nums, int start, int maxLength)
//	    {
//	         for(int i=1;i<=maxLength;i++)
//	         {
//	              for(int j=start;j<nums.length;j++){
//	              int returnLength = min(s, nums, i, j);
//	              if(returnLength!=-1)
//	              return returnLength;
//	               
//	              }
//	                 
//	               
//	         
//		    }
//		    return -1;
//	    }
//		public int min(int s, int[] nums, int length, int index)
//		{
//		    if(length==1&&index<nums.length)
//		    {
//	             if(nums[index]>=s)
//	             return length;
//	             else return -1;
//	                     
//		    }
//		     if(index>=nums.length)
//		    return -1;
//		    if(s<=0) return -1;
//		    else {
//		        int n=min_subarray_len(s-nums[index],  nums, index+1,length-1 );
//		        if(n!=-1)
//		        return  1+n;
//		        else return -1;
//		    }
//		   
//		}
	/*
	 * Time limit exceeded
	 */
//	 public int minSubArrayLen(int s, int[] nums) {
//	        if(nums==null) return 0;
//	        List<Integer> ll=new ArrayList<>();
//	        List<Integer> candidates=new ArrayList<>();
//	        for(int i=0;i<nums.length;i++)
//	        {
//	            candidates.add(nums[i]);
//	        }
//	        getLength( ll,0,candidates, 0,s);
//	        if(ll.size()==0) return 0;
//	        int min=ll.get(0);
//	        for(int i=1;i<ll.size();i++)
//	        {
//	            min=Math.min(min,ll.get(i));
//	        }
//	        return min;
//	    }
//	    
//	    public void getLength(List<Integer> lengthList, int length,List<Integer> candidates, int sum, int target)
//	    {
//	        if(sum>=target)
//	        {
//	             int l=length;
//	            lengthList.add(l);
//	            return;
//	        }
//	        List<Integer> c=new ArrayList<>(candidates);
//	        for(int i=0;i<c.size();i++)
//	        {
//	            sum+=c.get(i);
//	            int remove=c.get(i);
//	            c.remove(i);
//	            length++;
//	            getLength(lengthList, length,c, sum,target);
//	            length--;
//	            c.add(i,remove);
//	            sum-=remove;
//	        }
//	    }
//	    
	    public static void main(String[] args)
	    {
	    	LeetCode209 obj=new LeetCode209();
	    	int[] l={1,2,3,4,5};
	    	
	   // System.out.println(obj.minSubArrayLen(11, l));
	    	
	    }
}

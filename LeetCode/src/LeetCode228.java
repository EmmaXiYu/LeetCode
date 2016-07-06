import java.util.ArrayList;
import java.util.List;

public class LeetCode228 {

	 public List<String> summaryRanges(int[] nums) {
	       
	      if(nums==null||nums.length==0) return new ArrayList<>();
	      List<String> l=new ArrayList<>();
	      int startNum=nums[0];
	      StringBuilder sb=new StringBuilder();
	      sb.append(startNum);
	      boolean hasLeft=false;
	      boolean ifFirst=false;
	      for(int i=1;i<nums.length;i++)
	      {
	          if(startNum+1==nums[i])
	          {startNum=nums[i];
	              hasLeft=true;
	               ifFirst=false;
	          }
	           else
	           { if(hasLeft&&!ifFirst){
	                 sb.append("->");
	             sb.append(nums[i-1]);
	             hasLeft=false;}
	               l.add(sb.toString());
	               sb=new StringBuilder();
	               sb.append(nums[i]);
	               startNum=nums[i];
	               ifFirst=true;
	               hasLeft=true;
	           }
	          
	      }
	      
	      if(hasLeft&&!ifFirst)
	      {sb.append("->");
	    sb.append(nums[nums.length-1]);
	      l.add(sb.toString());}
	      else if(hasLeft&&ifFirst)
	       {
	      l.add(sb.toString());}
	      if(l.size()==0)
	         l.add(sb.toString());
	      return l;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

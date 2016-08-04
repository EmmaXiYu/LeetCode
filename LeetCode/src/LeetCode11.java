
public class LeetCode11 {
	 public int maxArea(int[] height) {
	       if(height==null||height.length==0)
	       return 0;
	       int i=0;
	       int j=height.length-1;
	      
	       int iValue=height[i];
	       int jValue=height[j];
	       int iIndex=i;
	       int jIndex=j;
	       int max=(j-i)*Math.min(iValue, jValue);
	       i++;
	       j++;
	       while(i<=j&&i<height.length-1&&j>0)
	       {
	           if(height[i+1]<=height[i]&&height[j-1]<=height[j])
	           {
	        	   i++;
	        	   j++;
	           }
	           else if(height[i+1]<height[i]&&height[j-1]>height[j])
	           {
	        	   jValue=height[j];
	        	   max=Math.max(max, (j-iIndex)*Math.min(iValue, jValue));
	           }
	           else if(height[i+1]>height[i]&&height[j-1]<height[j])
	           {
	        	   iValue=height[i];
	        	   max=Math.max(max, (j-i)*Math.min(iValue, jValue));
	           }
	           else {
	        	   
	           }
	       }
	    return max;
	    }
	public static void main(String[] args) {
		LeetCode11 obj=new LeetCode11();
		int [] l={2,3,10,5,7,8,9};
		System.out.println(obj.maxArea(l));
		

	}

}

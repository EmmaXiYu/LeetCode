
public class LeetCode303 {

	 private int [] numArray;
	   private int [] sumFromStart;
	    public LeetCode303(int[] nums) {
	     numArray=new int[nums.length];
	     sumFromStart=new int[nums.length];
	     int sum=0;

	        for(int i=0;i<nums.length;i++)
	    {
	        numArray[i]=nums[i];
	        sum+=nums[i];
	        sumFromStart[i]=sum;
	        
	    }
	    
	    }

	    public int sumRange(int i, int j) {
	        if(i==0)
	        return sumFromStart[j];
	        else return sumFromStart[j]-sumFromStart[i]+numArray[i];
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

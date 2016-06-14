
public class LeetCode189 {
	public static void rotate(int[] nums, int k) {
        if(nums==null) return;
        else if (k<0) return;
        else {
             k=k%nums.length;
        int [] numsNew =new int[nums.length];
       int  numsNewCounter=0;
        for(int i=nums.length-k;i<nums.length;i++)
    
        {
            numsNew[numsNewCounter]=nums[i];
            numsNewCounter++;
        }
        for(int i=0;i<nums.length-k;i++)
        {
             numsNew[numsNewCounter]=nums[i];
            numsNewCounter++;
        }
        for(int i=0;i<nums.length;i++)
            {
                nums[i]=numsNew[i];
            }
           // what's wrong with this? nums=numsNew;
        }
    }
	
	public static void main(String args[])
	{
		int [] intArray={1,3,4,5,6,7,8};
		for(int i=0;i<intArray.length;i++)
		{System.out.print(intArray[i]);}
		System.out.println();
		
		rotate(intArray,4);
		for(int i=0;i<intArray.length;i++)
		{System.out.print(intArray[i]);}
		System.out.println();
	}
}

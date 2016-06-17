
public class LeetCode27 {
	public static int removeElement(int[] nums, int val) {
        if(nums==null) return nums.length;
        else{
        int counter=0;
        int returnLength=nums.length;
        while(counter<returnLength)
        {
            if(nums[counter]==val){
                for(int i=counter;i<returnLength-1;i++)
                {
                    nums[i]=nums[i+1];
                }
                
               returnLength--; 
              
                
                
            }
            else counter++;
        }
        return returnLength;}
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] test={3,2,2,3};
		int n=removeElement(test,3);
		for(int i=0;i<n;i++)
		{
			System.out.println(test[i]+",");
		}
	}

}

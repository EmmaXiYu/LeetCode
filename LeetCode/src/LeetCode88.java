import java.util.Arrays;

public class LeetCode88 {

	
	 public static  void merge(int[] nums1, int m, int[] nums2, int n) {
	        for(int i=0;i<n;i++)
	        {
	            nums1[m+i]=nums2[i];
	            
	        }
	        Arrays.sort(nums1);
	        
	    }
	public static void main(String[] args) {
		int [] one =new int [12];
		one[0]=1;
		one[1]=3;
		one[2]=6;
		one[3]=7;
		one[4]=70;
		
		int counterOne=5;
		int [] two={0,1,2,3,5,36,51};
		int counterTwo=7;
		merge(one, counterOne, two, counterTwo);
		for(int i=0; i<counterOne;i++)
		{
			System.out.print(one[i]);
		}

	}

}

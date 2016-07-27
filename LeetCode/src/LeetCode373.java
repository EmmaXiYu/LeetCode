import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;



public class LeetCode373 {
	class Sum{
		private int[] array;
		private int sum;
		Sum(int[] array, int sum){
			this.array=new int[2];
			this.sum=0;
			this.array[0]=array[0];
			this.array[1]=array[1];
			this.sum=sum;
		}
	}
		class SumComparator implements Comparator<Sum> {

			@Override
			public int compare(Sum o1, Sum o2) {
			 if(o1.sum>o2.sum) return 1;
			 else if(o1.sum<o2.sum) return -1;
			 else return 0;
			}
			
		}
	

	  public List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {
		  
		 Comparator<Sum> comparator=new SumComparator();
		 PriorityQueue<Sum> pq=new PriorityQueue<Sum>(nums1.length*nums2.length,comparator);
		  for(int i=0;i<nums1.length;i++)
		  {
			  for(int j=0;j<nums2.length;j++)
			  {
				  int[] array=new int[2];
				  array[0]=nums1[i];
				  array[1]=nums2[j];
				  int sum=nums1[i]+nums2[j];
				  Sum s=new Sum(array,sum);
				  pq.add(s);
			  }
		  }
		  
		List<int[]> list=new ArrayList<>();
		for(int i=0;i<k;i++)
		{
			int [] a=pq.poll().array;

			list.add(a);
		}
	      return list; 
		  
	    }
	
	
	public static void main(String[] args) {
		LeetCode373 obj=new LeetCode373();
		int [] nums1={1,1,2};
		int [] nums2={1,2,3};
		List<int []> list=obj.kSmallestPairs(nums1, nums2, 3);
		for(int i=0;i<list.size();i++)
		{
			System.out.println("["+list.get(i)[0]+","+list.get(i)[1]+"], ");
		}
		
		

	}

}

import java.util.HashSet;

public class LeetCode217 {

	
	public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
      for(int i = 0; i < nums.length; i++) {
          if (set.contains(nums[i])) {
              return true;
          } else {
              set.add(nums[i]);
          }
      }
      return false;
	}
	
	
	public static void main(String[] args)
	{
		int [] test={1,4,5,6,6,5,6,6,8,8,20};
		System.out.println(containsDuplicate(test));
	}
}

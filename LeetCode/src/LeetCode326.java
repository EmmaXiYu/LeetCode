
public class LeetCode326 {

	public static  boolean isPowerOfThree(int n) {
     
		if(n<=0) return false;
		else if(n==1) return true;
		else if(n%3!=0) return false ;
		else {
			
	while(n>=3)
	{
		
		n=n/3;
		if(n>=3&&n%3!=0)
			return false;
		else if(n<3&&n!=1) return false;
		
		
	}
	return true;
		}
    }
	public static void main(String[] args) {
		System.out.println(isPowerOfThree(1));
		System.out.println(isPowerOfThree(0));
		System.out.println(isPowerOfThree(2));
		System.out.println(isPowerOfThree(-1));
		System.out.println(isPowerOfThree(3));
		System.out.println(isPowerOfThree(4));
		System.out.println(isPowerOfThree(9));
		System.out.println(isPowerOfThree(27));
		
	}

}

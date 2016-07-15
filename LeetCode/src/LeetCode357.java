
public class LeetCode357 {
	public static  int countNumbersWithUniqueDigits(int n) {
        if(n==0) return 1;
        int [] dp=new int[n+1];
        dp[0]=1;
        dp[1]=10;
        for(int i=2;i<=n;i++)
        {
            dp[n]=dp[n-1]+(dp[n-1]-dp[n-2])*(10-i+1);
        }
        
        return dp[n];
    }
	public static void main(String [] args)
	{
		System.out.print(countNumbersWithUniqueDigits(3));
	}
}

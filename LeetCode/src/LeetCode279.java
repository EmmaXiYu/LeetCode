
public class LeetCode279 {
	 public int numSquares(int n) {
	        int num=(int)Math.floor(Math.sqrt(n));
	        int [][] dp=new int[n+1][num+1];
	        
	        for(int i=1;i<dp.length;i++)
	        {
	            dp[i][1]=i;
	        }
	        for(int i=1;i<dp[0].length;i++)
	        {
	            dp[1][i]=1;
	        }
	        for(int i=2;i<dp.length;i++)
	        {
	            for(int j=2;j<dp[0].length;j++)
	            {
	            	if(dp[i][1]<(j*j))
	            	dp[i][j]=dp[i][j-1];
	            	else{
	                int k=dp[i][1]/(j*j);
	                int l=dp[i][1]%(j*j);
	                int temp=k+dp[l][j];
	                dp[i][j]=Math.min(dp[i][j-1],temp);}
	            }
	        }
	        return dp[n][num];
	        
	    }
	public static void main(String[] args) {
		LeetCode279 obj=new LeetCode279();
		obj.numSquares(4);
				

	}

}

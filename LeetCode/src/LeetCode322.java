
public class LeetCode322 {
	public int coinChange(int[] coins, int amount) {
        if(amount==0) return 0;
       int [][] dp=new int [amount][coins.length];
       int [] result=new int[amount];
       int initial=-1;
       for(int i=0;i<coins.length;i++)
       {
           if(coins[i]==1) {dp[0][i]=1;
               initial=1;
           }
           else dp[0][i]=-1;
       }
      result[0]=initial;
       for(int i=1;i<amount;i++)
       {
           int min=-1;
           boolean ifStart=false;
           for(int j=0;j<coins.length;j++)
           {
               if(i+1-coins[j]<0)
                 dp[i][j]=-1;
               else if(i+1-coins[j]==0)
               {dp[i][j]=1;}
             //  System.out.print(i+" dp"+dp[i][j]+"   ");}
               else if(result[i+1-coins[j]-1]==-1)
               dp[i][j]=-1;
               else dp[i][j]=result[i+1-coins[j]-1]+1;
            if(!ifStart&&dp[i][j]!=-1) {min=dp[i][j];
           // System.out.println("min"+min+"    ");
            ifStart=true;}
            else if(dp[i][j]!=-1)
            min=Math.min(min, dp[i][j]);
             
               
           }
           result[i]=min;
         //  System.out.println(i+":"+result[i]+"min"+min);
       }
       return result[amount-1];
    }
	public static void main(String[] args) {
		LeetCode322  obj =new LeetCode322();
		int [] l={186,419,83,408};
				
		System.out.println(obj.coinChange(l, 6249));

	}

}

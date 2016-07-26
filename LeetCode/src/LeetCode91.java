
public class LeetCode91 {

		 public int numDecodings(String s) {
		        if(s==null||s.length()==0) return 0;
		        else if(s.length()==1) // length==1 dp[1] exception
		        {
		           int n= Integer.parseInt(s.substring(0,1));
		           if(n<=26&&n>0)return 1;
		           else return 0;//first num cannot be 0;
		        }
		        int [] dp =new int[s.length()];
		        int first=Integer.parseInt(s.substring(0,1));
		        if(first>0&&first<=9)
		        dp[0]=1;
		        else return 0;//first num cannot be 0;
		        int num1=Integer.parseInt(s.substring(1,2));
		        int num=Integer.parseInt(s.substring(0,2));
		        if(num1==0&&num<=26)
		        dp[1]=1;//10
		        else if(num1!=0&&num<=26)
		        dp[1]=2;//e.g. 11
		        else if(num1!=0&&num>26)
		        dp[1]=1;//e.g 51
		        else return 0;//e.g 50 invalid
		        for(int i=2;i<s.length();i++)
		        {
		            int numPre=Integer.parseInt(s.substring(i-1,i));
		            num1=Integer.parseInt(s.substring(i,i+1));
		            if(numPre==0&&num1==0)
		            return 0;//e.g 100
		            num=Integer.parseInt(s.substring(i-1,i+1));
		          if(num1==0&&num<=26)
		          dp[i]=dp[i-2];//e.g. 7110
		          else if(num1!=0&&num<=26&&numPre!=0)
		          dp[i]=dp[i-1]+dp[i-2];//e.g. 11221
		          else if(num1!=0&&num<=26&&numPre==0)
		               dp[i]=dp[i-1];//e.g. 11201
		          else if(num>26&&num1!=0)
		          dp[i]=dp[i-1];//e.g. 11227
		          else return 0;//e.g. 11250
		          
		        }
		        return dp[s.length()-1];
		    }
   
    
	public static void main(String[] args) {
		LeetCode91 obj=new LeetCode91();
		String s="27";
		System.out.println(obj.numDecodings(s));

	}

}

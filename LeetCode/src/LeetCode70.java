
public class LeetCode70 {
	   public  static  int climbStairs(int n) {
			  if(n==0) return 0;
			  else if(n==1) return 1;
			  else{
			  int [] stop=new int[n];
			  int [] notStop=new int[n];
			  stop[0]=1;
			  notStop[0]=1;
			
			  for(int i=1;i<n;i++)
			  {
				  stop[i]=notStop[i-1]+stop[i-1];
				  notStop[i]=stop[i-1];
				  
			  }
			
			  return stop[n-1];
			  }
		        
		    }
	public static void main(String[] args) {
		
		for(int i=1;i<100;i++)
		{System.out.println(climbStairs(i));}	
	}

}

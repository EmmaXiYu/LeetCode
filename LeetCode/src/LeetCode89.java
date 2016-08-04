import java.util.ArrayList;
import java.util.List;

public class LeetCode89 {
	  public List<Integer> grayCode(int n) {
	        List<Integer> ll=new ArrayList<>();
	        int [] l=new int[n];
	        gray_Code( ll, n, l,0);
	        return ll;
	    }
	    
	    public void gray_Code(List<Integer> ll, int n, int [] l,int nextZero)
	    {
	       
	            int sum=0;
	            int multiplier=1;
	            for(int i=0;i<l.length;i++)
	            {
	                sum+=l[i]*multiplier;
	                multiplier*=2;
	            }
	            ll.add(sum);
	        
	        
	        for(int i=nextZero;i<n;i++)
	        {
	            l[i]=1; 
	            gray_Code( ll,n,l,i+1);
	            l[i]=0;
	        }
	        
	        
	    }
	    public static void main(String [] args){
	    LeetCode89 obj=new LeetCode89();
	    List<Integer> l=obj.grayCode(3);
	    for(int i=0;i<l.size();i++)
	    {
	    	System.out.println(l.get(i));
	    }
	    }
}

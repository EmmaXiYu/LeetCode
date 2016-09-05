import java.util.ArrayList;
import java.util.List;

public class LeetCode60 {
	
	 public String getPermutation(int n, int k) {
		 if(n==1) return 1+"";
	        int num=1;//num is number for permutation for each n for the first round
	        List<Integer> list=new ArrayList<>();
			StringBuilder sb=new StringBuilder();
		for(int i=1;i<n;i++)
		{
		    num*=i;
		    list.add(i);
		}
		int w=k;// w is how many number left for k
		list.add(n);
		int max=n;//max is how many number left for n
		while(max!=0){
		    
		int r=0;
		if(list.size()==1){
		sb.append(list.get(0));max-=1;}
		else {
		int mod=w%num;
		if(mod==0)
		r=w/num-1;
		else r=w/num;

		sb.append(list.get(r));
		list.remove(r);
		w=w-(r)*num;
		max-=1;
		num=num/(max);
		
		}
		}
		
		return sb.toString();
		
		
		
	 	}
	/*
	 * Time Limit exceeded
	 */
//	  public String getPermutation(int n, int k) {
//		    
//			 List<List<Integer>> ll=new ArrayList<>();
//			 List<Integer> l=new ArrayList<>();
//			 List<Integer> candidates=new ArrayList<>();
//			 for(int i=0;i<n;i++)
//			     candidates.add(i+1);
//			      get_permutation(ll,  l, candidates, n);
//			 List<Integer> permutation=ll.get(k-1);
//			 StringBuilder sb=new StringBuilder();
//			 for(int i=0;i<permutation.size();i++)
//			     sb.append(permutation.get(i));
//			     return sb.toString();
//	 	}
//	 	
//	 	public void get_permutation(List<List<Integer>> ll, List<Integer> l, List<Integer> candidates, int length)
//	 	{
//	 	    if(l.size()==length)
//	 	    {
//	 	        List<Integer> newList=new ArrayList<>(l);
//	 	        ll.add(newList);
//	 	        return;
//	 	    }
//	 	     List<Integer> newList=new ArrayList<>(l);
//	 	     List<Integer> c=new ArrayList<>(candidates);
//	 	     for(int i=0;i<c.size();i++)
//	 	     {
//	 	         int remove =c.get(i);
//	 	         newList.add(remove);
//	 	         c.remove(i);
//	 	         get_permutation( ll, newList, c,  length);
//	 	         newList.remove(newList.size()-1);
//	 	         c.add(i,remove);
//	 	     }
//	 	}
//
//		    
		    
		    
		    public static void main(String[] args)
		    {
		    	LeetCode60 obj=new LeetCode60();
		    	System.out.print(obj.getPermutation(5,120));
		    	
		    }
}

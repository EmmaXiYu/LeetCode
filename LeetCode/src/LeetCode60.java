import java.util.ArrayList;
import java.util.List;

public class LeetCode60 {
	  public String getPermutation(int n, int k) {
		    
		    List<String> list= get_Permutation_List(n);
		    return list.get(k-1);
		    }
		    
		    public List<String> get_Permutation_List(int n)
		    {
		        List<String> permutationList=new ArrayList<>();
		        char[] charList=new char[n];
		        permutation(permutationList, charList,0,n);
		        return permutationList;
		    }
		    
		    public void permutation(List<String> permutationList, char[] charList, int counter,int n)
		    {
		         if(counter==charList.length)
		         {
		             permutationList.add(String.valueOf(charList));
		             return;
		         }
		         for(int i=1;i<=n;i++)
		         {
		             boolean ifFound=false;
		             for(int j=0;j<counter;j++)
		             {
		                 if(charList[j]==String.valueOf(i).charAt(0))
		                 {
		                     ifFound=true;
		                     break;
		                 }
		                 
		             }
		             if(!ifFound)
		             {
		                 charList[counter]=String.valueOf(i).charAt(0);
		                 permutation(permutationList, charList, counter+1,n );
		             }
		             
		         }
		    }
		    
		    
		    public static void main(String[] args)
		    {
		    	LeetCode60 obj=new LeetCode60();
		    	System.out.print(obj.getPermutation(9,54494));
		    	
		    }
}

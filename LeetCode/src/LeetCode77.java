import java.util.ArrayList;
import java.util.List;

public class LeetCode77 {
	public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ll=new ArrayList<>();
        List<Integer> l=new ArrayList<>();
        List<Integer> c=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            c.add(i+1);
        }
        combination( ll,l,c, k);
        return ll;
    }
    
    public void combination(List<List<Integer>> ll, List<Integer> l, List<Integer> candidates, int k)
    {
        if(l.size()==k)
        {
            List<Integer> newList=new ArrayList<>(l);
            ll.add(newList);
            return;
        }
         List<Integer> newList=new ArrayList<>(l);
          List<Integer> c=new ArrayList<>(candidates);
        for(int i=0;i<c.size();i++)
        	while(c.size()!=0)
        {
            newList.add(c.get(0));
            c.remove(0);
            combination( ll,newList, c, k);
            newList.remove(newList.size()-1);
        }
    }
	public static void main(String[] args) {
		LeetCode77 obj=new LeetCode77();
		List<List<Integer>> l=obj.combine(4, 2);
		System.out.println("[");
		for(int i=0;i<l.size();i++)
		{
			System.out.print("[");
			for(int j=0;j<l.get(i).size();j++)
			{
				System.out.print(l.get(i).get(j)+",");
			}
		    System.out.println("],");
		}
		System.out.println("]");

	}

}

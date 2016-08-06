import java.util.ArrayList;
import java.util.List;

final class LeetCode6 {

	public String convert(String s, int numRows) {
        if(s==null||s.length()==0) return "";
      
         if (numRows==1) return s;
          if (s.length()<numRows) 
          numRows =s.length();
        List<List<String>> ll=new ArrayList<>();
        for(int i=0;i<numRows;i++)
        {
            List<String> l=new ArrayList<>();
            ll.add(l);
        }
        int counter=0;
        int directionIndicator=0;// 0:down, 1:up
        for(int i=0;i<s.length();i++)
        {
            if(directionIndicator==0&&counter<ll.size())
            {
                ll.get(counter).add(s.substring(i,i+1));
                counter++;
            }
           else if (directionIndicator==0&&counter==ll.size())
            {
                directionIndicator=1;
                counter=counter-2;
             i--;
            }
             else if(directionIndicator==1&&counter>0)
            {
                ll.get(counter).add(s.substring(i,i+1));
                counter--;
            }
             else if(directionIndicator==1&&counter==0)
            {
                directionIndicator=0;
                ll.get(counter).add(s.substring(i,i+1));
                counter++;
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<ll.size();i++)
        {
            for (int j=0;j<ll.get(i).size();j++)
            {
                sb.append(ll.get(i).get(j));
            }
        }
        return sb.toString();
    }
	public static void main(String[] args) {
		LeetCode6 obj=new LeetCode6();
		String s="ABCD";
		System.out.println(obj.convert(s, 2));

	}

}

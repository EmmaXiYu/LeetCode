import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class LeetCode151 {
	 public String reverseWords(String s) {
		 if(s==null||s=="") return "";
	        StringTokenizer st=new StringTokenizer(s," ");
	        List<String> l=new ArrayList<>();
	        StringBuilder sb=new StringBuilder();
	        while(st.hasMoreTokens())
	        {
	        	
	        	l.add(0,st.nextToken());
	        }
	        for(int i=0;i<l.size()-1;i++)
	        {
	        	sb.append(l.get(i));
	        	sb.append(" ");
	        }
	        sb.append(l.get(l.size()-1));
	        return sb.toString();
	    }
	public static void main(String[] args) {
		

	}

}

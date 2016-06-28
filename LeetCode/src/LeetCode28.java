
public class LeetCode28 {
	 public int strStr(String haystack, String needle) {
	        if(haystack!=null&&needle.length()==0)return 0;
		      else if(haystack==null||needle==null||needle.length()>haystack.length())
		       return -1;
		       else {
			 int position=-1;
			 for(int i=0;i<haystack.length();i++)
			 {
				if(haystack.substring(i,i+1).equals(needle.substring(0,1)))
				{
					int length=needle.length();
					if(haystack.length()<i+length)
					{
					    position=-1;
					    break;
					}
				   else if(haystack.substring(i,i+length).equals(needle))
						{ 
						position=i;
						break;}
				}
			 }
			 return position;}
		    }
}

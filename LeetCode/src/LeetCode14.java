
public class LeetCode14 {

	 /*
	  * It's so easy to have bug
	  */
	  public String longestCommonPrefix(String[] strs) {
	        if(strs==null||strs.length==0)return "";
	        if(strs.length==1) return strs[0];
	        String result="";
	        String frist=strs[0];
	        int len=frist.length()-1;
	    result= LCP( strs, strs[0], 0, len,"");
	     return result ;
	        
	    }
	    
	    public String LCP(String[] strs, String firstString, int low, int high,String lcp)
	    {
	        if(low>high) return lcp;
	        int mid=low+(high-low)/2;
	        String preLCP=lcp;
	        for(int i=1;i<strs.length;i++)
	        {
	           if(strs[i].length()-1<mid) 
	              return   LCP( strs, firstString, low, mid-1,preLCP);
	           else if(!strs[i].substring(0, mid+1).equals(firstString.substring(0, mid+1))) 
	           { 
	        	   return LCP( strs,  firstString, low, mid-1,preLCP);
	           }
	        else if(strs[i].length()-1==mid&&strs[i].substring(0, mid+1).equals(firstString.substring(0, mid+1)))
	        {
	            if(lcp.length()<mid+1)
	            {
	            	preLCP=lcp;
	            	lcp=strs[i].substring(0, mid+1);}
	        }
	        else{
	        	if(i==strs.length-1)
	        	{ if(lcp.length()<mid+1){
	        			preLCP=lcp;
	 	            lcp=strs[i].substring(0, mid+1);}
	           return   LCP( strs,  firstString, mid+1, high,lcp);}
	        	else {
	        		if(lcp.length()<mid+1)
	 	            lcp=strs[i].substring(0, mid+1);
	        	
	           }}
	        }
	        String re=lcp;
	        return re;
	    }
	public static void main(String[] args) {
		LeetCode14 obj=new LeetCode14();
		String[] sa={"abab","aba",""};
		System.out.println(obj.longestCommonPrefix(sa));

	}

}

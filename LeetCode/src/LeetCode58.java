
public class LeetCode58 {
	
	 public static int lengthOfLastWord(String s) {
	        
		 if(s==null||s.length()==0) return 0;
		 else{
		 char[] charArray=s.toCharArray();
		 int startPoint=0;
		 int endPoint=-1;
		 for(int i=charArray.length-1;i>=0;i--)
		 {
			 if(charArray[i]!=' ')
			 {
				 startPoint=i;
				 break;
			 }
		 }
		 for(int i=startPoint;i>=0;i--)
		 {
			 if(charArray[i]==' ')
			 {
				 endPoint=i;
				 break;
			 }
		 }
		 return startPoint-endPoint;}
		 
	    }

	public static void main(String[] args) {
       String s="a";
       System.out.println(lengthOfLastWord(s));
	}

}

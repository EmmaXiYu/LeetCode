
public class LeetCode342 {

	 public static boolean isPowerOfFour(int num) {
		 if(num==1) return true;
		 else if(num==0||num<0) return false;
		 else{
			  String s="";
			   char[] numChar;
	          s=Integer.toBinaryString(num);
			 numChar=s.toCharArray();
	       if(numChar.length%2==0) return false ;
	       else {
	    	   for(int i=1;i<numChar.length;i++)
	    	   {
	    		   if(numChar[i]!='0')
	    		   {
	    			   return false;
	    		   }
	    	   }
	    	   return true;
	       }
	     
	    }
	 }
	public static void main(String[] args) {
		System.out.println(isPowerOfFour(20));
		System.out.println(isPowerOfFour(0));
		System.out.println(isPowerOfFour(1));
		System.out.println(isPowerOfFour(16));
		System.out.println(isPowerOfFour(-64));
		System.out.println(isPowerOfFour(-2147483648));
		System.out.println(	Integer.MIN_VALUE);
	}

}

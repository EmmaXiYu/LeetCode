
public class LeetCode231 {

	 public static boolean isPowerOfTwo(int n) {
     if(n<=0) return false;
	     else{
	    	 String string=Integer.toBinaryString(n);	 
	    	 char[] stringArray=string.toCharArray();
	for(int i=1;i<stringArray.length;i++)
	    	 {
    		 if(stringArray[i]!='0')
	    			 return false;	    	 }
    	 return true;
     }
	     
	
    }
	
	public static void main(String[] args) {
		System.out.println(isPowerOfTwo(0));
		System.out.println(isPowerOfTwo(1));
		System.out.println(isPowerOfTwo(-100));
		System.out.println(isPowerOfTwo(2));
		System.out.println(isPowerOfTwo(4));
		System.out.println(isPowerOfTwo(5));
	}

}

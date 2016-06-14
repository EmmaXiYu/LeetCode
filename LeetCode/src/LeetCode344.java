
public class LeetCode344 {

	
	public static String reverseString(String s) {
        char[] charArray=s.toCharArray();
        for(int i=0;i<s.length()/2;i++)
        {
            char temp =charArray[i];
            charArray[i]=charArray[s.length()-1-i];
            charArray[s.length()-1-i]=temp;
        }
        s=String.valueOf(charArray);
        return s;
         
    }
	public static String reverseString2(String s) {
       StringBuilder  sb=new StringBuilder(s);
       return sb.reverse().toString();
         
    }
	public static void main(String[] args) {
		 
	System.out.println(reverseString("hello"));
	System.out.println(reverseString2("hello"));
	}

}


public class LeetCode125 {
	/*Time limite exceed
	 public static boolean isPalindrome(String s) {
	        if(s.equals(null||s.equals("") return true;
	        else {
	        boolean ifP=true;
	        String newString="";
	        char[] charList=s.toLowerCase().toCharArray();
	        for(int i=0; i< charList.length;i++)
	        {
	        	if(lowerCase.substring(i,i+1).equals("a")||lowerCase.substring(i,i+1).equals("b")||lowerCase.substring(i,i+1).equals("c")||lowerCase.substring(i,i+1).equals("d")||lowerCase.substring(i,i+1).equals("e")||lowerCase.substring(i,i+1).equals("f")||lowerCase.substring(i,i+1).equals("g")||lowerCase.substring(i,i+1).equals("h")||lowerCase.substring(i,i+1).equals("i")||lowerCase.substring(i,i+1).equals("j")||lowerCase.substring(i,i+1).equals("k")||lowerCase.substring(i,i+1).equals("l")||lowerCase.substring(i,i+1).equals("m")||lowerCase.substring(i,i+1).equals("n")||lowerCase.substring(i,i+1).equals("o")||lowerCase.substring(i,i+1).equals("p")||lowerCase.substring(i,i+1).equals("r")||lowerCase.substring(i,i+1).equals("s")||lowerCase.substring(i,i+1).equals("t")||lowerCase.substring(i,i+1).equals("w")||lowerCase.substring(i,i+1).equals("x")||lowerCase.substring(i,i+1).equals("y")||lowerCase.substring(i,i+1).equals("z")||lowerCase.substring(i,i+1).equals("q")||lowerCase.substring(i,i+1).equals("v")||lowerCase.substring(i,i+1).equals("u")||lowerCase.substring(i,i+1).equals("0")||lowerCase.substring(i,i+1).equals("1")||lowerCase.substring(i,i+1).equals("2")||lowerCase.substring(i,i+1).equals("3")||lowerCase.substring(i,i+1).equals("4")||lowerCase.substring(i,i+1).equals("5")||lowerCase.substring(i,i+1).equals("6")||lowerCase.substring(i,i+1).equals("7")||lowerCase.substring(i,i+1).equals("8")||lowerCase.substring(i,i+1).equals("9")
	             newString+= lowerCase.substring(i,i+1);
	        }
	        
	        for(int i=0;i<newString.length()/2;i++)
	        {
	        	String one=newString.substring(i, i+1);
	        	String two =newString.substring(newString.length()-1-i,newString.length()-i);
	            if(!newString.substring(i, i+1).equals(newString.substring(newString.length()-1-i,newString.length()-i)))
	            {ifP=false;
	                break;
	            }
	        }
	        return ifP;}
	    }
	 */
	 
	 public static boolean isPalindrome(String s) {
	
		        if(s==null||s.equals("")) return true;
			        else {
			       
			            for(int i=0, j=s.length()-1;i<j;i++,j--)
			            {
			                 if(!Character.isLetterOrDigit(s.charAt(i))) {
				               // i++;
			                	 j++;
				                continue;
				            }
				               if(!Character.isLetterOrDigit(s.charAt(j))) {
				               // j--;
				            	   i--;
				                continue;
				            }      
			              if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
				                return false;
				            }    
			                
			            }
			            
			            
			           return true; }
			            
			        
		    }
	    
	public static void main(String[] args) {
		String test="A man a plan a canal: Panama";
		System.out.println(isPalindrome(test));

	}

}

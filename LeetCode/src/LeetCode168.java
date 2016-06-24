
public class LeetCode168 {

	 public static String convertToTitle(int n) {
	      int level=1;
	   
	      while(n>(int )Math.pow(26, level))
	      {
	    	  level++;
	      }
	      String returnString="";
	      for(int i=level;i>0;i--)
	      {
	    	  
	    	  returnString+=getRepresent(n%(int)Math.pow(26, i)/(int)Math.pow(26, i-1));
	    	  n-=(int)Math.pow(26, i-1)*(n%(int)Math.pow(26, i)/(int)Math.pow(26, i-1));
	    
	      }
	     
	      return returnString;
	    }
	 
	 public static String getRepresent(int n)
	 {
		 if(n==1) return "A";
		 else if(n==2) return "B";
		 else if(n==3) return "C";
		 else if(n==4) return "D";
		 else if(n==5) return "E";
		 else if(n==6) return "F";
		 else if(n==7) return "G";
		 else if(n==8) return "H";
		 else if(n==9) return "I";
		 else if(n==10) return "J";
		 else if(n==11) return "K";
		 else if(n==12) return "L";
		 else if(n==13) return "M";
		 else if(n==14) return "N";
		 else if(n==15) return "O";
		 else if(n==16) return "P";
		 else if(n==17) return "Q";
		 else if(n==18) return "R";
		 else if(n==19) return "S";
		 else if(n==20) return "T";
		 else if(n==21) return "U";
		 else if(n==22) return "V";
		 else if(n==23) return "W";
		 else if(n==24) return "S";
		 else if(n==25) return "Y";
		 else if(n==0) return "Z";
		return "";
		
		 
	 }
	public static void main(String[] args) {
		int test=26;
		System.out.println(convertToTitle(test));
	}

}

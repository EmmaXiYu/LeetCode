
public class LeetCode171 {

   public static int titleToNumber(String s) {
	   int returnInteger=0;
	   for(int i=0;i<s.length();i++)
	   {
		   String substring=s.substring(i,i+1);
		   int integerRepresent=0;
		   if(substring.equals("A"))
			   integerRepresent=1;
		   else if(substring.equals("B"))
			   integerRepresent=2;
		   else if(substring.equals("C"))
			   integerRepresent=3;
		   else if(substring.equals("D"))
			   integerRepresent=4;
		   else if(substring.equals("E"))
			   integerRepresent=5;
		   else if(substring.equals("F"))
			   integerRepresent=6;
		   else if(substring.equals("G"))
			   integerRepresent=7;
		   else if(substring.equals("H"))
			   integerRepresent=8;
		   else if(substring.equals("I"))
			   integerRepresent=9;
		   else if(substring.equals("J"))
			   integerRepresent=10;
		   else if(substring.equals("K"))
			   integerRepresent=11;
		   else if(substring.equals("L"))
			   integerRepresent=12;
		   else if(substring.equals("M"))
			   integerRepresent=13;
		   else if(substring.equals("N"))
			   integerRepresent=14;
		   else if(substring.equals("O"))
			   integerRepresent=15;
		   else if(substring.equals("P"))
			   integerRepresent=16;
		   else if(substring.equals("Q"))
			   integerRepresent=17;
		   else if(substring.equals("R"))
			   integerRepresent=18;
		   else if(substring.equals("S"))
			   integerRepresent=19;
		   else if(substring.equals("T"))
			   integerRepresent=20;
		   else if(substring.equals("U"))
			   integerRepresent=21;
		   else if(substring.equals("V"))
			   integerRepresent=22;
		   else if(substring.equals("W"))
			   integerRepresent=23;
		   else if(substring.equals("X"))
			   integerRepresent=24;
		   else if(substring.equals("Y"))
			   integerRepresent=25;
		   else if(substring.equals("Z"))
			   integerRepresent=26;
		   returnInteger+=integerRepresent*Math.pow(26, s.length()-i-1);
	   }
        return returnInteger;
    }
	public static void main(String[] args) {
		String test="AB";
		System.out.println(titleToNumber(test));

	}

}

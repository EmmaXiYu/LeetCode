
public class LeetCode66 {
/*
 * This method does not work if it access the range of integer.
 */
//	 public static int[] plusOne(int[] digits) {
//		 String digit="";
//		 for(int i=0;i<digits.length;i++)
//		 {
//			 digit+=digits[i];
//           
//		 }	
//		 int convert=Integer.parseInt(digit);
//		 convert+=1;
//		 digit=Integer.toString(convert);
//		 char[] returnChar=digit.toCharArray();
//		 int [] returnInt =new int[returnChar.length];
//		 for(int i=0;i<returnInt.length;i++)
//		 {
//			 returnInt[i]=Integer.parseInt(""+returnChar[i]);
//		 }
//		return returnInt;
//	        
//	    }
//	 
	 public static int[] plusOne(int[] digits) {
		
		 return plus_one(digits,digits.length-1 );
		
	    }
	 
	 public static int [] plus_one(int [] digits, int position)
	 {
	
		 if(digits[position]==9&&position!=0)
			{digits[position]=0;
			return plus_one(digits,position-1);
			}
		 else if(digits[position]==9&&position==0)
		 {
			 int[] newArray=new int [digits.length+1];
			 newArray[0]=1;
			 newArray[1]=0;
			 for(int i=1;i<digits.length;i++)
			 {
				 newArray[i+1]=digits[i];
			 }
			 return newArray;
		 }

		else 
			{digits[position]+=1;
		 return digits;}
	    }
	 
	 
	public static void main(String[] args) {
		int [] digits={9,9};
		int [] returnR=plusOne(digits);
		for(int i=0;i<returnR.length;i++)
		{
			System.out.print(returnR[i]);
		}
	}

}

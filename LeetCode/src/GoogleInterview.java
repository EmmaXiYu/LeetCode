
public class GoogleInterview {

	/*
	 * Given a string like 3(abc)2(bc)cc, the output should be abcabcabcbcbccc
	 */
	public static  String buildAString(String s)
	{
		String number="";
		int intNum=0;
		String string="";
		String returnString="";
		char[] sArray=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			if(Character.isDigit(sArray[i])&&string.equals(""))
				number+=sArray[i];
			else if(Character.isDigit(sArray[i])&&!string.equals(""))
			{
				returnString+=string;
				string="";
			}
			else if(sArray[i]=='('&&!number.equals(""))
			{
				intNum=Integer.parseInt(number);
			}
			else if(sArray[i]!='('&&sArray[i]!=')')
			{
				string+=sArray[i];
			}
			else if(sArray[i]==')'&&!string.equals(""))
			{
				for(int j=0;j<intNum;j++)
				returnString+=string;
			    string="";
			    number="";
			    intNum=0;	
			}
		}
		if(!string.isEmpty())
		{
			returnString+=string;
			string="";
		}
		return returnString;
	}
	public static void main(String[] args) {
		String s="3(abc)2(bc)cc";
		System.out.println(buildAString(s));
		String s2="(abc)2(bc)cc";
		System.out.println(buildAString(s2));
		String s3="(abc)2(bc)3(cc)";
		System.out.println(buildAString(s3));
	}

}

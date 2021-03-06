import java.util.ArrayList;
import java.util.List;

/*
 * bug free: hard
 * knowledge: easy
 */
public class LeetCode165 {

	 public static  int compareVersion(String version1, String version2) {
		 int indexOfDot=0;
	        int indexOfDotPre=0;
	        List<Integer> intList1=new ArrayList<>();
	        List<Integer> intList2=new ArrayList<>();
	        if(version1.contains(".")){
	        while(indexOfDot<version1.lastIndexOf('.'))
	        {
	        	  String substring1=version1.substring(indexOfDotPre);
		           indexOfDot=indexOfDotPre+version1.substring(indexOfDotPre).indexOf('.');
		           intList1.add(Integer.parseInt(version1.substring(indexOfDotPre,indexOfDot)));
		         indexOfDotPre=indexOfDot+1;
	        }
	         intList1.add(Integer.parseInt(version1.substring(indexOfDot+1)));}
	         else intList1.add(Integer.parseInt(version1.substring(0)));
	         if(version2.contains(".")){
	          indexOfDot=0;
	         indexOfDotPre=0;
	         while(indexOfDot<version2.lastIndexOf('.'))
		        {
		        	  String substring2=version2.substring(indexOfDotPre);
			           indexOfDot=indexOfDotPre+version2.substring(indexOfDotPre).indexOf('.');
			           intList2.add(Integer.parseInt(version2.substring(indexOfDotPre,indexOfDot)));
			         indexOfDotPre=indexOfDot+1;
		        }
		         intList2.add(Integer.parseInt(version2.substring(indexOfDot+1)));}
		         else intList2.add(Integer.parseInt(version2.substring(0)));
	         double version1Num=0;
	         double version2Num=0;
	         for(int i=0;i<intList1.size();i++)
	         {
	        	 version1Num+=intList1.get(i)*Math.pow(10,-i);
	         }
	         for(int i=0;i<intList2.size();i++)
	         {
	        	 version2Num+=intList2.get(i)*Math.pow(10,-i);
	         } 
	         int result=0;
	         if((version1Num-version2Num)<0.0000000000001&&(version1Num-version2Num)>-0.0000000000001)
	         result=0;
	         else if ((version1Num-version2Num)>0.0000000000001)
             result=1;
	         else if((version1Num-version2Num)<-0.0000000000001)
	        	 result =-1;
	         
	         return result;
	         }
	public static void main(String[] args) {
		String one="1.0";
		String two="1";
		System.out.println(compareVersion(one,two));
	}

}

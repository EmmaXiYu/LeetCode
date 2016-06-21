import java.util.ArrayList;
import java.util.List;

public class LeetCode118 {
	 public List<List<Integer>> generate(int numRows) {
	        if(numRows==0)
	        {
	            List<List<Integer>> listOfList =new ArrayList<>();
	            return listOfList;
	        }
	        else if(numRows==1)
	        {
	             List<List<Integer>> listOfList =new ArrayList<>();
	             List<Integer> list=new ArrayList<>();
	             list.add(1);
	             listOfList.add(list);
	            return listOfList;
	        }
	        else if(numRows==2)
	        {
	             List<List<Integer>> listOfList =new ArrayList<>();
	             List<Integer> list1=new ArrayList<>();
	             list1.add(1);
	             listOfList.add(list1);
	             List<Integer> list2=new ArrayList<>();
	             list2.add(1);
	             list2.add(1);
	             listOfList.add(list2);
	            return listOfList;
	        }
	        else {
	             List<List<Integer>> listLessNumber=generate(numRows-1);
	              List<Integer> list=new ArrayList<>();
	              for(int i=0;i<listLessNumber.get(listLessNumber.size()-1).size()-1;i++)
	              {
	                  list.add(listLessNumber.get(listLessNumber.size()-1).get(i)+listLessNumber.get(listLessNumber.size()-1).get(i+1));
	              }
	              list.add(0,1);
	              list.add(1);
	              listLessNumber.add(list);
	              return listLessNumber;
	             
	             
	        }
	    }
}

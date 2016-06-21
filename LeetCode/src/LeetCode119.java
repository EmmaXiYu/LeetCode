import java.util.ArrayList;
import java.util.List;

public class LeetCode119 {

	
	 public static  List<Integer> getRow(int rowIndex) {
	        return generate(rowIndex);
	 }
	     public  static  List<Integer> generate(int numRows) {
	        if(numRows==0) {
	            List<Integer> list=new ArrayList<>();
	             list.add(1);
	             return list;
	        }
	        else if(numRows==1)
	        {
	             
	             List<Integer> list=generate(0);
	             list.add(1);
	            return list;
	        }
	        else {
	           
	              List<Integer> list=generate(numRows-1);
	              if(numRows%2==0)
	              {
	                  list.add(numRows/2,list.get(numRows/2-1)+list.get(numRows/2-1));
	                  int i=numRows/2-1;
	                  int j=numRows/2+1;
	                  while(i>0&&j<list.size()-1)
	                
	                  {
	                      list.set(i,list.get(i)+list.get(i-1));
	                      list.set(j,list.get(j)+list.get(j+1));
	                      i--;j++;
	                  }
	                      
	                  
	              }
	              else 
	              {
	                  list.set(numRows/2,list.get(numRows/2-1)+list.get(numRows/2));
	                  list.add(numRows/2+1,list.get(numRows/2));
	                  int i=numRows/2-1;
	                  int j=numRows/2+2;
	                  while(i>0&&j<list.size()-1){
	                 
	                      list.set(i,list.get(i)+list.get(i-1));
	                      list.set(j,list.get(j)+list.get(j+1));
	                      i--;
	                      j++;
	                  }
	                      
	              }
	              return list;
	             
	             
	        }
	     }
	public static void main(String[] args) {
		
		List<Integer> list=getRow(5);
		for(int i =0;i<list.size();i++)
		{
			System.out.print(list.get(i));
		}
	}

}

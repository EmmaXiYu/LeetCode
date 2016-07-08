import java.util.ArrayList;
import java.util.List;

public class LeetCode54 {

	
	
	 public List<Integer> spiralOrder(int[][] matrix) {
	        if (matrix==null|| matrix.length==0) return new ArrayList<>();
	        else if (matrix.length==1&&matrix[0].length>1)
	        {  
	            List<Integer> list=new ArrayList<>();
	            
	            for(int i=0;i<matrix[0].length;i++)
	            {
	                list.add(matrix[0][i]);
	                
	            }
	            return list;
	        }
	        else if (matrix[0].length==1&&matrix.length>1)
	        {  List<Integer> list=new ArrayList<>();
	            
	            for(int i=0;i<matrix.length;i++)
	            {
	                list.add(matrix[i][0]);
	            }
	            return list;
	        }
	       else if (matrix[0].length==1&&matrix.length==1)
	        {  List<Integer> list=new ArrayList<>();
	            
	          list.add(matrix[0][0]);
	          return list;
	        }
	        List<Integer> list=new ArrayList<>();
	        int rowIterator=0;
	        int columnIterator=0;
	        while(rowIterator<matrix.length/2&&columnIterator<matrix[0].length/2)
	        {
	            for(int j=rowIterator;j<matrix[0].length-1-rowIterator;j++)
		           list.add(matrix[rowIterator][j]);
		        for(int i=columnIterator;i<matrix.length-1-columnIterator;i++)
		         list.add(matrix[i][matrix[0].length-1-columnIterator]);
	            
	              for(int j=matrix[0].length-1-columnIterator;j>columnIterator;j--)
		          list.add(matrix[matrix.length-1-columnIterator][j]);
	            
		       for(int i=matrix.length-1-rowIterator;i>rowIterator;i--)
		           list.add(matrix[i][rowIterator]);
		           rowIterator++;
		           columnIterator++;
		           
	        }
	        if(matrix.length%2!=0&&matrix[0].length>=matrix.length)
	        {
	            for(int i=rowIterator;i<matrix[0].length-rowIterator;i++)
	              list.add(matrix[matrix.length/2][i]);
	        }
	        
	         else if(matrix[0].length%2!=0&&matrix.length>=matrix[0].length)
	        {
	            for(int i=columnIterator;i<matrix.length-columnIterator;i++)
	              list.add(matrix[i][matrix[0].length/2]);
	        }
	        
	       
		 return list;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

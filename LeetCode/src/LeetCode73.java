import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class LeetCode73 {
	 public void setZeroes(int[][] matrix) {
	        
	        HashMap<Integer, Integer> row=new HashMap<>();
	        HashMap<Integer, Integer> column=new HashMap<>();
	        for(int i=0;i<matrix.length;i++)
	        {
	            for(int j=0;j<matrix[0].length;j++)
	            {
	                if(matrix[i][j]==0)
	                {
	                    row.put(i,0);
	                    column.put(j,0);
	                }
	            }
	        }
	        
	        Iterator<Map.Entry<Integer, Integer>> iteratorRow=row.entrySet().iterator();
	        while(iteratorRow.hasNext())
	        {
	            int r=iteratorRow.next().getKey();
	            for(int i=0;i<matrix[0].length;i++)
	            {
	                matrix[r][i]=0;
	            }
	        }
	        
	        Iterator<Map.Entry<Integer, Integer>> iteratorColumn=column.entrySet().iterator();
	        while(iteratorColumn.hasNext())
	        {
	            int c=iteratorColumn.next().getKey();
	            for(int i=0;i<matrix.length;i++)
	            {
	                matrix[i][c]=0;
	            }
	        }
	    }
}

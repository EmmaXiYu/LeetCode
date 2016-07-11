
public class LeetCode74 {
	public boolean searchMatrix(int[][] matrix, int target) {
        int [] row=search_Matrix(matrix, 0, matrix.length-1, target);
        if(row==null) return false;
        return search_Row(row, 0, row.length-1, target);
        
    }
    
    public int [] search_Matrix(int[][] matrix, int startRow, int endRow, int target)
    {
        if(startRow>endRow) return null;
        int midRow=startRow+(endRow-startRow)/2;
        if (matrix[midRow][0]>target)
        return search_Matrix(matrix, startRow, midRow-1, target);
        else if(matrix[midRow][0]<target&&matrix[midRow][matrix[0].length-1]<target)
        return search_Matrix(matrix, midRow+1, endRow, target);
        else if(matrix[midRow][0]<=target&&matrix[midRow][matrix[0].length-1]>=target)
        return matrix[midRow];
        return null;
    }
    
     public boolean search_Row(int[] row, int start, int end, int target)
     {
         if(row==null) return false;
         else if(start>end) return false;
         int mid=start+(end-start)/2;
         if(row[mid]>target)
         return search_Row(row, start, mid-1, target);
         else if(row[mid]<target)
          return search_Row(row, mid+1, end, target);
          else if(row[mid]==target)
          return true;
          return false;
     }
}

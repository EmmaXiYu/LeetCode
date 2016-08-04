
public class LeetCode240 {
	/*
	 * Be careful of the area guaranteed to be bigger or smaller than the matrix[mid][mid] value
	 */
	 public boolean searchMatrix(int[][] matrix, int target) {
	        if(matrix==null||matrix.length==0)return false;
	       return  search_Matrix( matrix,  target, 0, matrix.length, 0, matrix[0].length);
	    }
	    public boolean search_Matrix(int [][] matrix, int target, int rowLow, int rowHigh, int columnLow, int columnHigh)
	    {

	        if(rowLow>rowHigh||columnLow>columnHigh)return false ;
	        int rowMid=rowLow+(rowHigh-rowLow)/2;
	        int columnMid=columnLow+(columnHigh-columnLow)/2;
	        if(matrix[rowMid][columnMid]==target)
	        return true;
	        if(matrix[rowMid][columnMid]>target)
	        return search_Matrix(matrix,  target,  rowLow, rowMid-1, columnLow, columnHigh)||
	        search_Matrix(matrix,  target,  rowMid, rowHigh, columnLow, columnMid-1);
	        
	        else
	        return search_Matrix(matrix,  target,  rowMid+1, rowHigh, columnLow, columnHigh)||
	        search_Matrix(matrix,  target,  rowLow, rowHigh, columnMid+1, columnHigh);
	    }
	public static void main(String[] args) {
		LeetCode240 obj=new LeetCode240();
		int [][] matrix={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
				
		System.out.println(obj.searchMatrix(matrix, 5));

	}

}

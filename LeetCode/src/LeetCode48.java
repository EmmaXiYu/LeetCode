
public class LeetCode48 {

	/*
	 * Rotate 180 degree which is wrong
	 */
//	public void rotate(int[][] matrix) {
//        if(matrix==null || matrix.length==0) return;
//       
//            for(int i=0;i<matrix.length/2;i++)
//            {
//                for(int j=0;j<matrix.length;j++)
//                {
//                    int temp=matrix[i][j];
//                    matrix[i][j]=matrix[matrix.length-1-i][matrix.length-1-j];
//                    matrix[matrix.length-1-i][matrix.length-1-j]=temp;
//                }
//                
//            }
//         if(matrix.length%2!=0)
//            {
//                 for(int j=0;j<matrix.length/2;j++)
//                {
//                    int temp=matrix[matrix.length/2][j];
//                    matrix[matrix.length/2][j]=matrix[matrix.length/2][matrix.length-1-j];
//                    matrix[matrix.length/2][matrix.length-1-j]=temp;
//                }
//            }
//    }
	/*
	 * This method is to rotate 90 degree
	 */
	
	public void rotate(int[][] matrix) {
	       if(matrix==null||matrix.length==0) return;
	       for(int s=0;s<matrix.length/2;s++){
	       
	       for(int i=s;i<matrix.length-1-s;i++)
	       {
	           int temp=matrix[i][matrix.length-1-s];
	           matrix[i][matrix.length-1-s]=matrix[s][i];
	           matrix[s][i]=temp;
	       }
	       for(int j=matrix.length-1-s;j>s;j--)
	       {
	           int temp=matrix[matrix.length-1-s][j];
	           matrix[matrix.length-1-s][j]=matrix[s][matrix.length-1-j];
	           matrix[s][matrix.length-1-j]=temp;
	       }
	       for(int i=matrix.length-1-s;i>s;i--)
	       {
	           int temp=matrix[i][s];
	           matrix[i][s]=matrix[s][matrix.length-1-i];
	           matrix[s][matrix.length-1-i]=temp;
	       }
	       }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

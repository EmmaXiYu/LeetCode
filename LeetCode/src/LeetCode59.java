
public class LeetCode59 {

public int[][] generateMatrix(int n) {
        
        if(n==0) return new int[0][0];
        int [][] matrix=new int[n][n];
        int num=1;
        for(int i=0;i<n/2;i++)
        {
            for(int j=i;j<matrix.length-i;j++ )
            {
                matrix[i][j]=num;
                num++;
            }
            for(int j=i+1;j<matrix[0].length-i;j++)
            {
                matrix[j][matrix[0].length-1-i]=num;
                num++;
            }
            for(int j=matrix[0].length-1-i-1;j>=i;j--)
        {
            matrix[matrix.length-1-i][j]=num;
            num++;
        }
           for(int j=matrix.length-1-i-1;j>i;j--)
        {
            matrix[j][i]=num;
            num++;
        }
        }
        if(n%2!=0)
    {
        int i=n/2;
        matrix[i][i]=num;
    }
        return matrix;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

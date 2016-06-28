import java.util.HashSet;

public class LeetCode36 {
	 public static  boolean isValidSudoku(char[][] board) {
	        
		 HashSet<Character> hs=new HashSet<Character> ();
		 boolean ifValid=true;
		 for(int i=0;i<board.length;i++)
		 {
			for(int j=0;j<board[i].length;j++)
			{
				if(Character.isDigit(board[i][j])&&hs.contains(board[i][j]))
				{
			ifValid=false;
			break;
				}
				else if(Character.isDigit(board[i][j]))
				{hs.add(board[i][j]);}
					
			}
			hs=new HashSet<Character> ();
		 }	
		 for(int i=0;i<board[0].length;i++)
		 {
			for(int j=0;j<board.length;j++)
			{
				if(Character.isDigit(board[j][i])&&hs.contains(board[j][i]))
				{
			ifValid=false;
			break;
				}
				else if(Character.isDigit(board[j][i]))
				{hs.add(board[j][i]);}
					
			}
			hs=new HashSet<Character> ();
		 }	
		 int num=(int)Math.sqrt(board.length);
		 for(int i=0;i<=board.length-num;i=i+num)
		 {
			 for(int j=0;j<=board.length-num;j=j+num)
			 {
				 if(!isValidSudoku(board,i,i+num,j,j+num))
				 {
					 ifValid=false;
					 break;
				 }
			 }
		 }
		 return ifValid;
	 }
		 public static boolean isValidSudoku(char[][] board, int startRow,int endRow,int startColumn,int endColumn)
		 {
			 
			HashSet<Character> hs=new HashSet<Character> ();
			 boolean ifValid=true;
			 for(int i=startRow;i<endRow;i++)
			 {
				for(int j=startColumn;j<endColumn;j++)
				{
					if(Character.isDigit(board[i][j])&&hs.contains(board[i][j]))
							{
						ifValid=false;
						break;
							}
					else if(Character.isDigit(board[i][j]))
					{hs.add(board[i][j]);}
						
						
				}
			 }	
			 
			 return ifValid;
		 }
	public static void main(String[] args) {
	char[][] board={{'.','4','.','.','.','.','.','.','.'},{'.','.','4','.','.','.','.','.','.'},
			{'.','.','.','1','.','.','7','.','.'},{'.','.','.','.','.','.','.','.','.'},
			{'.','.','.','3','.','.','.','6','.'},{'.','.','.','.','.','6','.','9','.'},
			{'.','.','.','.','1','.','.','.','.'},{'.','.','.','.','.','.','2','.','.'},{'.','.','.','8','.','.','.','.','.'},};
	
	char[][] board2={{'.','.','.','.','.','.','5','.','.'},{'.','.','.','.','.','.','.','.','.'},
			{'.','.','.','.','.','.','.','.','.'},{'9','3','.','.','2','.','4','.','.'},
			{'.','.','7','.','.','.','3','.','.'},{'.','.','.','.','.','.','.','.','.'},
			{'.','.','.','3','4','.','.','.','.'},{'.','.','.','.','.','3','.','.','.'},{'.','.','.','.','.','5','2','.','.'},};
	System.out.println(isValidSudoku(board2));

	}

}

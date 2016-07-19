import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class LeetCode79 {
	 public boolean exist(char[][] board, String word) {
	      
	      for(int i=0;i<board.length;i++)
	      {
	          for(int j=0;j<board[0].length;j++)
	          {
	             
	              if(check_exist(board,  word, i, j, 0))
	              {
	                 return true;
	              }
	            
	          }
	      }
	      return false;
	    }
	   
	   public boolean check_exist(char[][] board, String word, int index_i, int index_j,int num)
	   {
	      if(num>word.length()-1)return false ;
	      if(index_i<0||index_j<0||index_i>=board.length||index_j>=board[0].length) return false;
	     
	       if(board[index_i][index_j]==word.charAt(num)){
	    	   if(num==word.length()-1)return true;
	    	   char c=board[index_i][index_j];
	    	   board[index_i][index_j]='#';
	    	   num=num+1;
	    	if(!(check_exist(board, word, index_i-1,index_j, num) || check_exist(board,  word, index_i,index_j+1, num )||check_exist(board,  word, index_i+1,index_j, num )||check_exist(board,  word, index_i,index_j-1, num)))
	    	{
	    		 board[index_i][index_j]=c;
	    	}
	    	else return  true;
	       }
	      return false;
	   }
	
	/*
	 * Time limit exceeded
	 */
//	 public boolean exist(char[][] board, String word) {
//	      
//	      for(int i=0;i<board.length;i++)
//	      {
//	          for(int j=0;j<board[0].length;j++)
//	          {
//	              HashMap<List<Integer>, Integer> hm=new HashMap<>();
//	              if(check_exist(board,  word, i, j, 0,hm ))
//	              {
//	                 return true;
//	              }
//	          }
//	      }
//	      return false;
//	    }
//	   
//	   public boolean check_exist(char[][] board, String word, int index_i, int index_j,int num,  HashMap<List<Integer>, Integer> hm  )
//	   {
//	      if(num>word.length()-1)return false ;
//	      if(index_i<0||index_j<0||index_i>=board.length||index_j>=board[0].length) return false;
//	      List<Integer> l=new ArrayList<>();
//	      l.add(index_i);
//	      l.add(index_j);
//	      if(hm.containsKey(l)) return false;
//	       if(board[index_i][index_j]==word.charAt(num)){
//	    	   if(num==word.length()-1)return true;
//	    	   HashMap<List<Integer> , Integer> newHm=new HashMap<>(hm);
//	    	     newHm.put(l, num);
//	    	   num=num+1;
//	    	
//	      return  (check_exist(board,  word, index_i-1,index_j, num,newHm) || check_exist(board,  word, index_i,index_j+1, num ,newHm)||check_exist(board,  word, index_i+1,index_j, num ,newHm)||check_exist(board,  word, index_i,index_j-1, num,newHm ));
//	           
//	       }
//	       else return false;
//	   }
	public static void main(String[] args) {
		LeetCode79 obj=new LeetCode79();
		/*
		 * ABCE","SFCS","ADEE
		 */
		char [][] board={{'A','B','C','E'},{
			'S','F','C','S'
		},{'A','D','E','E'}};
		System.out.println(obj.exist(board,"ABCCED"));
		/*
		 * ["aa"]
          "aaa"
		 */
		char [][] board2={{'a','a'}};
		System.out.println(obj.exist(board2,"aaa"));
		/*
		 * ["ABCE","SFES","ADEE"]
"ABCEFSADEESE"
		 */
		char [][] board3={{'A','B','C','E'},{
			'S','F','E','S'
		},{'A','D','E','E'}};
		System.out.println(obj.exist(board3,"ABCEFSADEESE"));
		/*
		 * ["aaaa","aaaa","aaaa","aaaa","aaab"]
"aaaaaaaaaaaaaaaaaaaa"
		 */
		char [][] board4={{'a','a','a','a'},{
			'a','a','a','a'
		},{'a','a','a','a'},{'a','a','a','b'}};
		System.out.println(obj.exist(board4,"aaaaaaaaaaaaaaaaaaaa"));
		/*
		 * ["CAA","AAA","BCD"]
          "AAB"
		 */
		char [][] board5={{'C','A','A'},{
			'A','A','A'
		},{'B','C','D'}};
		System.out.println(obj.exist(board5,"AAB"));
	}

}

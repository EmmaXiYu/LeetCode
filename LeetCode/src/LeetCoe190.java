
public class LeetCoe190 {

    public static int reverseBits(int n) {
    	
         int result=0;
         for(int i= 0;i<32;i++)
         {
        	int bit=( n&1);
        	n=n>>1;
         result<<=1;
         result=result|bit;
      
         
         }
         return result;
        }
    
	
	
	public static void main(String[] args) {
		
     int test=43261596;
    System.out.println( reverseBits(test));
	}

}

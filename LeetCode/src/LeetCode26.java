
public class LeetCode26 {
	 public static int removeDuplicates(int[] nums) {
	        
	        
	        if(nums==null||nums.length==0) return 0;
	        else if(nums.length==1) return 1;
	        else{
	            
	            int returnLength=nums.length;
	            
	            int duplicateStartPosition=0;
	            int duplicateEndPosition=0;
	            int counter=1;
	            int currentNum=nums[0];
	            boolean ifCountingDuplicate=false;
	            while(counter<returnLength)
	            {
	                
	                if(nums[counter]==currentNum)
	                {
	                    if(ifCountingDuplicate==false)
	                      {
	                          duplicateStartPosition=counter;
	                          ifCountingDuplicate=true;
	                          duplicateEndPosition=duplicateStartPosition;
	                      }
	                      else
	                      {duplicateEndPosition=counter;
	                       
	                      }
	                      counter++;
	                      
	                      
	                }
	                
	                else if(nums[counter]!=currentNum&&ifCountingDuplicate==false)
	                {currentNum=nums[counter];
	                    counter++;
	                }
	             else if(nums[counter]!=currentNum&&ifCountingDuplicate==true)
	             {
	                 
	                 for(int i=counter;i<returnLength;i++)
	                 {
	                     
	                     nums[i-(duplicateEndPosition-duplicateStartPosition)-1]=nums[i];
	                     
	                 }
	                 ifCountingDuplicate=false;
	                 returnLength=returnLength-(duplicateEndPosition-duplicateStartPosition+1);
	                 counter=duplicateStartPosition+1;
	                 currentNum=nums[duplicateStartPosition];
	                 
	             }
	              
	               if(ifCountingDuplicate==true&&counter==returnLength)
	               {
	                returnLength= returnLength-(duplicateEndPosition-duplicateStartPosition+1); 
	               }
	            }
	            return returnLength;
	        }
	    }
	public static void main(String[] args) {
	int[] nums={-3,-1,-1,0,0,0,0,0,2};
	int newLength=removeDuplicates(nums);
	for(int i=0;i<newLength;i++)
	{
		System.out.print(nums[i]+",");
	}

	}

}

import java.util.ArrayList;
import java.util.List;

public class LeetCode390 {

public int lastRemaining(int n) {
	
	int start=0;
	int end =n-1;
	int direction=0; //0: left->right; 1:right->left;
	int round=1;
	while(start<end)
	{
		if(direction==0){
		start=start+round;
		if(start==end)
			return    start+1;
		if(end==n-1&&(end+1)%2!=0)
			end=end-round;
		else if(end!=n-1){
		int k=(end-start+1)/2;
		if(k%2==0)
			end=end-round;}

 		if(start==end)
			return    start+1;
		round*=2;
 		direction=1;
		}
		else if(direction==1)
		{
			
			int k=(end -start+1)/2;
			if(k%2==0)
				start=start+round;
			if(start>end)
			if(start==end)
				return start+1;
			end=end-round;
			if(start==end)
				return    start+1;
			direction=0;
			round*=2;
			
		}
		
	}
	return start+1;
        
    }
	
	
	public static void main(String[] args) {
		LeetCode390 obj=new LeetCode390();
		System.out.println(obj.lastRemaining(2)+"2"); //2
		System.out.println(obj.lastRemaining(3)+"2"); //3
		System.out.println(obj.lastRemaining(4)+"2"); //2
		System.out.println(obj.lastRemaining(5)+"2");//2
		System.out.println(obj.lastRemaining(6)+"4");//4
		System.out.println(obj.lastRemaining(7)+"4");//4///////
		System.out.println(obj.lastRemaining(8)+"6");////6
		System.out.println(obj.lastRemaining(9)+"6");//6
		System.out.println(obj.lastRemaining(10)+"8");//8
		System.out.println(obj.lastRemaining(11)+"8");//8///////
		System.out.println(obj.lastRemaining(12)+"6");//6
		System.out.println(obj.lastRemaining(13)+"6");//6
		System.out.println(obj.lastRemaining(14)+"8");//6
		System.out.println(obj.lastRemaining(15)+"8");//6
 		System.out.println(obj.lastRemaining(16)+"8");//6
	}

}

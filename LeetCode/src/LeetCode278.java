
public class LeetCode278 {

	public static int firstBadVersion(int n) {
		if(n==1) return 1;
		int firstBadPosition = 1;
		int left = 1;
		int right = n;
		int checkPosition = (left + right) / 2;
		boolean ifFoundFirstBadVersion=false;
		while (!ifFoundFirstBadVersion) {
			if (isBadVersion(checkPosition)) {
				if(checkPosition>1){
					if(isBadVersion(checkPosition-1)){
				firstBadPosition = checkPosition;
				right = checkPosition;
				checkPosition =left+ (right-left) / 2; 
				}
					else{
						ifFoundFirstBadVersion=true;
						firstBadPosition = checkPosition;
					}
			}
				else{
					ifFoundFirstBadVersion=true;
					firstBadPosition = checkPosition;
				}
				
			} else {
				left = checkPosition + 1;
				checkPosition = left+ (right-left) / 2;
			}		
		}
		return firstBadPosition;
	}

	public static boolean isBadVersion(int i) {
		//int firstBadVersion = 1702766719;
		int firstBadVersion=1702766719;
		if (i < firstBadVersion)
			return false;
		else
			return true;
	}

	public static void main(String[] args) {
		//System.out.println(firstBadVersion(2126753390));
		System.out.println(firstBadVersion(2126753390));
	}

}

public class LeetCode223 {
	 public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
	        int areaA=Math.abs((C-A)*(D-B));
	        int areaB=Math.abs((G-E)*(H-F));
	        if(areaA==0&&areaB==0) return 0;
	        else if (A==E&&B==F&&C==G&&D==H) return areaA;
	        else if(areaA==0&&areaB!=0) return areaB;
	        else if(areaA!=0&&areaB==0) return areaA;
	        else if(E>=C||G<=A) return areaA+areaB;
	        else if(B>=H||F>=D) return areaA+areaB;
	        else if(E>=A&&F>=B&&G<=C&&H<=D) return areaA;
	        else if(E<=A&&F<=B&&G>=C&&H>=D) return areaB;
	        else{
	        int leftBottomX=Math.max(A,E);
	        int leftBottomY=Math.max(B,F);
	        int leftTopX=Math.max(A,E);
	        int leftTopY=Math.min(H,D);
	        int rightBottomX=Math.min(C,G);
	        int rightBottomY=Math.max(D,H);
	        int rightTopX=Math.min(C,G);
	        int rightTopY=Math.min(D,H);
	        int length=Math.abs(rightBottomX-leftBottomX);
	        int width=Math.abs(leftTopY-leftBottomY);
	        int area=length*width;
	        return areaA+areaB-area;}
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

package twoPointers;

// https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/description/
public class MaxPointsNCards {
	public static void main(String[] args) {
		int cardPoints[] = {6, 2 ,3, 4, 7, 2, 1, 7 ,1};
		int k = 4;
		System.out.println(maxScore(cardPoints, k));
	}
	
	public static int maxScore(int[] cardPoints, int k) {
		
		int lsum = 0;
		int rsum = 0;
		int maxlength = 0;
		
		for(int i=0; i<=k-1; i++){
			lsum = lsum + cardPoints[i];
			maxlength = Math.max(maxlength, lsum);
		}
		
		int rightind = cardPoints.length-1;
		for(int i=k-1; i>=0;i--){
			lsum = lsum - cardPoints[i];
			rsum = rsum + cardPoints[rightind];
			rightind = rightind -1;
			maxlength = Math.max(maxlength, lsum+rsum);
		}
		return maxlength;
	}
}
 
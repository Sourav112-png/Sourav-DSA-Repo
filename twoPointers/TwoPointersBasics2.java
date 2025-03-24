package twoPointers;

public class TwoPointersBasics2 {
	public static void main(String[] args) {
		int arr[] = {2,5,1,6  ,7,10};
		int k = 14;
		System.out.println(maxLengthBrute(arr, k));
	}
		
	///Brute Force Approach.
	public static int maxLengthBrute(int arr[], int k) {
		int maxLength = 0;
		int sum =0;
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i; j<arr.length-1;j++) {
				sum = sum+arr[j];
				if(sum <= k) {
					maxLength = Math.max(maxLength, j-i+1);
				}
				else {
					break;
				}
			}
		}
		return maxLength;
	}
	
	
}

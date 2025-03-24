package twoPointers;

public class TwoPointersBasics1 {
	public static void main(String[] args) {
		int arr[] = {-1,2,3,3,4,5,-1};
		int k =4;
		System.out.println(maxSum(arr, k));
	}
	
	public static int maxSum(int arr[], int k) {
		
		int left = 0;
		int right = k-1;
		int sum =0;
		int maxSum =0;
		
		while(right < arr.length-1) {
			sum = sum - arr[left];
			left++;
			right++;
			sum = sum + arr[right];
			maxSum = Math.max(maxSum, sum);
		}
		
		return maxSum;
	}
}

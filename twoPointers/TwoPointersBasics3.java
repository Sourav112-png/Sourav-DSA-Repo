package twoPointers;

public class TwoPointersBasics3 {
	public static void main(String[] args) {
		int arr[] = {2,5,1,6,7,10};
		int k = 14;
		System.out.println(lengthOfArray(arr, k));
	}
	
	
	//2 pointers approach	
	public static int lengthOfArray(int arr[], int k) {
		
		int left = 0;
		int right = 0;
		int sum = 0;
		int maxlength = 0;
		
		while(right < arr.length) {
			
			sum = sum + arr[right];
			right++;
			
			if(sum > k) {
				sum = sum - arr[left];
				left++;
			}
			if(sum <= k) {
				maxlength = Math.max(maxlength, (right - left));
			}
		}
		
		return maxlength;
		
	}
}

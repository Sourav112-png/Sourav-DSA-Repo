package twoPointers;

import java.util.HashSet;
//2 pointers/sliding window
public class TwoPointersBasics {
	public static void main(String[] args) {
		int arr[] = {2, 5, 1, 10 ,10, 4};
		int k = 14;
		System.out.println(sumOfElements(arr, k));
	}

	public static int sumOfElements(int[] arr, int k) {
		int l =0;
		int r =0;
		int sum =0;
		int maxlength = 0;
		
		while(r<arr.length) {
			sum = sum + arr[r];
			while(sum>k){
				sum = sum - arr[l];
				l++;
			}
			if(sum <= k) {
				maxlength = Math.max(maxlength, r - l+1);
				r++;
			}
			
		}
		return maxlength;
	}
}

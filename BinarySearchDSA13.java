package Searching;

import java.util.Arrays;

//https://leetcode.com/problems/kth-missing-positive-number/description/
public class BinarySearchDSA13 {
	public static void main(String[] args) {
		int k = 5;
		int arr[] = {2,3,4,7,11};
		int ans = findKthPositive(arr, k);
		System.out.println(ans);
	}

	public static int findKthPositive(int[] arr, int k) {
		int start = 0;
		int end = arr.length-1;
		int missing = 0;
		while(start<=end) {
			int mid = start + (end - start)/2;
		    missing = arr[mid] - (mid + 1);
			if(missing < k) {
				start = mid + 1;
			}
			else 
					end  = mid - 1;

		}        
		int ans = k + end + 1;
		return ans;
	}
}

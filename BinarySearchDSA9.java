package Searching;

//https://leetcode.com/problems/find-in-mountain-array/description/
public class BinarySearchDSA9 {
	public static void main(String[] args) {
		int arr[] = {3, 5, 3, 2, 0};
		int target = 2;
		int ans = findTheTargetOnLeft(arr, target);
		System.out.println(ans);
	}
	
	static int findTheTargetOnLeft(int arr[], int target) {
		int peak = findThePeak(arr);
		int start = 0;
		int end = peak;
		while(start<=end) {
			int mid = start + (end - start)/2;

				if(target < arr[mid]) {
					end = mid - 1;
				}
				else if(target > arr[mid]) {
					start = mid + 1;
				}
				else
					return mid;
			}
		return findTheTargetOnRight(arr, target);
	}
	
	static int findTheTargetOnRight(int arr[], int target) {
		int peak = findThePeak(arr);
		int start = peak+1;
		int end = arr.length-1;
		while(start<=end) {
			int mid = start + (end - start)/2;

			if(target < arr[mid]) {
				start = mid + 1;
			}
			else if(target > arr[mid]) {
				end = mid - 1;
			}
			else
				return mid;
			}
		return -1;
	}
	
	static int findThePeak(int[] arr) {
		int start=0;
		int end = arr.length-1;

		while(start<=end) {
			int mid = start + (end - start)/2; 
			if(arr[mid - 1] < arr[mid]) {
				if(arr[mid + 1] < arr[mid]) {
					return mid;
				}
				else
					start = mid + 1;
			}
			else
				end = mid;
		}
		return -1;
	}
}

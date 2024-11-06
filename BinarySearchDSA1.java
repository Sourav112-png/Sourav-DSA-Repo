package Searching;

//Ceiling of a number
//tip* do not use agnostic binary search.
public class BinarySearchDSA1 {

	static int ceilNumber(int arr[], int target) {
		
		int start=0;
		int end = arr.length-1;

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
		return arr[start];
		
	}

	public static void main(String[] args) {
		int target = 18;
		int arr[] = {2,3,5,9,14,16,17,18};
		int ans = ceilNumber(arr, target);
		System.out.println(ans);
	}
}

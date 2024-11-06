package Searching;

/// Array is in descending Order.
public class BinarySearch2 {
	public static void main(String[] args) {
		//int arr[] = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
		int arr[] = {89, 45, 22, 18, 16, 15, 4, 3, 2, 0, -4, -12, -18};
		int target = 22;
		int ans = binarySearch(arr, target);
		System.out.println(ans);
	}

	static int binarySearch(int[] arr, int target) {
		int start=0;
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

}

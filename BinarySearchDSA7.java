package Searching;

//852 Peak Index in a mountain array.
public class BinarySearchDSA7 {
	public static void main(String[] args) {
		//int arr[] = {2, 5, 10, 15, 12, 11, 9, 8, 6, 7, 4, 3, 2};
		int arr[] = {3, 5, 3 , 2, 0};
		int ans = binarySearch(arr);
		System.out.println(ans);
	}
	static int binarySearch(int[] arr) {
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

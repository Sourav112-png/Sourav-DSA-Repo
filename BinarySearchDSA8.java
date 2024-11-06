package Searching;

//162. Find the peak element
public class BinarySearchDSA8 {
	public static void main(String[] args) {
		int arr[] = {3, 5, 3 , 2, 0};
		int ans = binarySearch(arr);
		System.out.println(ans);
	}
	static int binarySearch(int[] arr) {
		int start=0;
		int end = arr.length-1;

		while(start<end) {
			int mid = start + (end - start)/2; 
			if(arr[mid] > arr[mid+1]) {
				end = mid;
			}
			else {
				start = mid + 1;
			}
		}
		return start;
	}
}

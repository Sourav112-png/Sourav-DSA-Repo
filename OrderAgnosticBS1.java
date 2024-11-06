package Searching;

public class OrderAgnosticBS1 {
	public static void main(String[] args) {
		//int arr[] = {89, 45, 22, 18, 16, 15, 4, 3, 2, 0, -4, -12, -18};
		int arr[] = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
		int target = 22;
		int ans = orderAgnosticBS(arr, target);
		System.out.println(ans);
	}

	static int orderAgnosticBS(int[] arr, int target) {
		int start = 0;
		int end = arr.length-1;
		while(start<=end) {
			int mid = start + (end - start)/2;

			boolean isAsc = (arr[start]<arr[end]);

			if(arr[mid] == target) {
				return mid;
			}

			if(isAsc) {
				if(arr[mid] > target) {
					end = mid - 1;
				}
				else if(arr[mid] < target) {
					start = mid + 1;
				}

			}
			else
				if(target < arr[mid]) { 	
					start = mid + 1;
				}
				else if(target > arr[mid]) {
					end = mid - 1;
				}
		}
		return -1;
	}
}

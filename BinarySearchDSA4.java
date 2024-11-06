package Searching;

public class BinarySearchDSA4 {

	static int searchRange(int nums[], int target) {
		int start = 0;
		int end = nums.length-1;
		int arr[] = new int[nums.length];
		while(start<=end) {
			int mid = start + (end-start)/2;
			if(nums[start] == target || nums[mid] == target) {
				for(int i =0; i<arr.length;i++) {
					arr[i] = start;
					System.out.println(arr[i]);
				}
			}

			if(target<nums[mid]) {
				end = mid - 1;
			}
			else
				start = mid + 1;
		}
		return start;
	}
	public static void main(String[] args) {
		int nums[] = {5,7,7,8,8,10};
		int target = 8;
		int ans = searchRange(nums, target);
		System.out.println(ans);
	}
}

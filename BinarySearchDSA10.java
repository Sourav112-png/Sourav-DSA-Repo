package Searching;

//https://leetcode.com/problems/search-in-rotated-sorted-array/description/
public class BinarySearchDSA10 {
	public static void main(String[] args) {
		int nums[] = {4, 5, 6, 7, 0, 1, 2};
		int target = 5;
		int ans = findTheTargetOnLeft(nums, target);
		System.out.println(ans);
	}
	
	static int findTheTargetOnLeft(int nums[], int target) {
		int pivot = findPivot(nums);
		int start = 0;
		int end = pivot;
		while(start<=end) {
			int mid = start + (end - start)/2;

				if(target < nums[mid]) {
					end = mid - 1;
				}
				else if(target > nums[mid]) {
					start = mid + 1;
				}
				else
					return mid;
			}
		return findTheTargetOnRight(nums, target);
	}
	
	static int findTheTargetOnRight(int nums[], int target) {
		int peak = findPivot(nums);
		int start = peak+1;
		int end = nums.length-1;
		while(start<=end) {
			int mid = start + (end - start)/2;

			if(target < nums[mid]) {
				end = mid - 1;
			}
			else if(target > nums[mid]) {
				start = mid + 1;
			}
			else
				return mid;
			}
		return -1;
	}

	static int findPivot(int nums[]) {
		int start = 0;
		int end = nums.length-1;
		while(start<=end) {
			int mid = start + (end - start)/2;
			//Four Cases.
			if(mid < end && nums[mid] > nums[mid + 1]) { //  mid < start -- will avoid numsay index out of bound exception.
				return mid;
			}
			if(mid > start && nums[mid] < nums[mid - 1]) { // mid > start -- will avoid numsay index out of bound exception.
				return mid - 1;
			}
			if(nums[start] > nums[mid]) { 
				end = mid - 1;
			}
			else {
				start = mid + 1;
			}
				
		}
		return -1;
	}

}

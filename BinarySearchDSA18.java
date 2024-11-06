package Searching;

//https://leetcode.com/problems/find-the-duplicate-number/description/
public class BinarySearchDSA18 {
	public static void main(String[] args) {
		int nums[] = {1,5,5,6,2,8,4,7,5,5};
		System.out.println(findDuplicate(nums));
	}

	public static int findDuplicate(int[] nums) {
		int start = 0;
		int end = nums.length-1;
		while(start<=end) {
			int mid = start + (end - start)/2;
			//case 1
			if(nums[start] == nums[mid] || nums[end] == nums[mid]) {
				return nums[mid];
			}
			//case 2
			if(mid < end && nums[mid] == nums[mid + 1] || mid > start && nums[mid] == nums[mid - 1]) {
				return nums[mid];
			}
			//case 3
			if(nums[start] < nums[end]) {
				if(nums[start] < nums[mid]) {
					start = mid + 1;
				}
				else {
					end = mid - 1;
				}

			}
			else {
				if(nums[end] < nums[mid]) {
					end = mid - 1;
				}
				else {
					start = mid + 1;
				}	
			}
		}
		return -1;
	}
}

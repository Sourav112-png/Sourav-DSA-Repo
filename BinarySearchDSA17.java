package Searching;

//https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
public class BinarySearchDSA17 {
	public static void main(String[] args) {
		int target = 8;
		int[] nums = {7, 8, 1, 2, 3, 3, 3, 4, 5, 6};
		System.out.println(search(nums, target));
	}
	
	public static boolean search(int[] nums, int target) {
		int start = 0;
		int end = nums.length-1;
		while(start<=end) {
			int mid = start + (end - start)/2;
			
			// If the mid points to the target 
			if(nums[mid] == target) {
				return true;
			}
			
			if(nums[mid] == nums[start] && nums[mid] == nums[end]) {
				start = start + 1;
				end = end - 1;
				continue;
			}
			
			// if left part is sorted
			if(nums[mid]>=nums[start]) {
				if(nums[start]<=target && nums[mid]>=target) {
					end = mid - 1;
				}
				else
					start = mid + 1;
			}
			else {
				if(nums[mid]<=target && nums[end]>=target) {
					start = mid + 1;
				}
					else {
					end = mid - 1;
				}
				
			}
		}
			return false;
	}

}

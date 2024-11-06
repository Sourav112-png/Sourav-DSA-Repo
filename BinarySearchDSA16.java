package Searching;

//https://leetcode.com/problems/single-element-in-a-sorted-array/
public class BinarySearchDSA16 {
public static void main(String[] args) {
	int arr[] = {1,1,2,2,3,3,4,4,8,8,9};
	System.out.println(singleNonDuplicate(arr));
}

public static int singleNonDuplicate(int[] nums) {
	int start = 0;
	int end = nums.length-1;
	int leftSize = 0;
	while(start <= end ) {
		int mid = start + (end - start)/2;
	
		if((mid - 1 < 0 || nums[mid - 1] != nums[mid]) &&
		(mid+1 == nums.length || nums[mid] != nums[mid + 1])){
			return nums[mid];
		}
		
		if(nums[mid-1] == nums[mid]) {
			leftSize = mid-1;
		}
		else {
			leftSize = mid;
		}
		
		if(leftSize % 2 != 0) {
			end = mid - 1;
		}
		else {
			start = mid + 1;
		}
	}
	return -1;
}

}

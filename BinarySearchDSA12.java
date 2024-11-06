package Searching;

//https://leetcode.com/problems/split-array-largest-sum/description/
public class BinarySearchDSA12 {
	public static void main(String[] args) {

		int nums[] = {7, 2, 5, 10, 8};
		int K = 2;
		System.out.println(splitArray(nums, K));
	}

	static int splitArray(int nums[], int k) {
		int max = 0;
		int min = 0;
		for(int i =0; i<nums.length; i++) {
			max = max + nums[i];
			if (nums[i] > min)
				min = nums[i];

		}
		int start = min;
		int end = max;
		while(start<end) {
			int mid = start + (end - start)/2;
			int sum = 0;
			int count = 1;
			for(int num : nums) {
				if(sum + num > mid) {
					sum = num;
					count++;
				}
				else
					sum = sum + num;

			}
			if (count <= k) {
				end = mid;
			}
			else
				start = mid + 1;
		} 

		return end; // because start == end
	}

}

package twoPointers;

// https://leetcode.com/problems/count-number-of-nice-subarrays/
public class NiceSubArrays {
	public static void main(String[] args) {
		int nums[] = {1,1,2,1,1};
		int k = 3;
		System.out.println(numberOfSubarrays(nums, k));
	}

	public static int numberOfSubarrays(int[] nums, int k) {
		return minNiceSubArr(nums, k) - minNiceSubArr(nums, k - 1);  
	}

	public static int minNiceSubArr(int[] nums, int k) {
		int left = 0;
		int right = 0;
		int sum = 0;
		int count = 0;

		if(k < 0) {
			return 0;
		}

		while(right < nums.length) {
			sum = sum+(nums[right] % 2);
			while(sum > k) {
				sum = sum - (nums[left] % 2);
				left++;
			}
			count = count + (right - left + 1);
			right++;
		}
		return count;
	}
}

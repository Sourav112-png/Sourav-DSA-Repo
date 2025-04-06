package twoPointers;

// https://leetcode.com/problems/binary-subarrays-with-sum/description/
public class BinarySubArrWithSum {
	public static void main(String[] args) {
		int[] nums = {1,0,1,0,1};
		int goal = 2;
		System.out.println(numSubarraysWithSum(nums, goal));
	}

	public static int numSubarraysWithSum(int[] nums, int goal) {
		return minGoal(nums, goal) - minGoal(nums, goal - 1);
	}

	public static int minGoal(int[] nums, int goal) {
		int left = 0;
		int right = 0;
		int sum = 0;
		int count = 0;

		if(goal < 0) {
			return 0;
		}

		while(right < nums.length) {
			sum = sum+nums[right];
			while(sum > goal) {
					sum = sum - nums[left];
					left++;
			}
				count = count + (right - left + 1);
				right++;
		}
		return count;
	}
}

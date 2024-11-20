package ArraysAndHashing;

import java.util.Arrays;

//1. Two Sum
public class ArraysAndHashing3 {
	public static void main(String[] args) {
		int[] arr = { 3, 3 };
		int target = 6;
		int[] ans = twoSum(arr, target);
		System.out.println(Arrays.toString(ans));
	}

	public static int[] twoSum(int[] nums, int target) {
		int[] ans = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					ans[0] = j;
					ans[1] = i;
				}
			}
		}

		return ans;

	}
}

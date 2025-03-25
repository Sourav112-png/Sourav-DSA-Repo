package twoPointers;

// https://leetcode.com/problems/max-consecutive-ones-iii/description/
public class MaxConsecutive {
	public static void main(String[] args) {
		int nums[] = {1,1,1,0,0,0,1,1,1,1,0};
		int k=2;
		System.out.println(longestOnes(nums, k));
	}

	public static int longestOnes(int[] nums, int k) {

		int zero = 0;
		int maxlength = 0;
		int left = 0;
		int right = 0;

		while(right < nums.length) {

				if(nums[right] == 0) {
					zero++;
				}
				
				while(zero > k) {
					if(nums[left] == 0) {
						zero--;
					}
					left++;
				}
				
				if(zero <= k) {
					maxlength = Math.max(maxlength, right - left + 1);
					right++;
				}

		}

		return maxlength;			
	}
}

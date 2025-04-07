package twoPointers;

import java.util.HashMap;
import java.util.HashSet;

// https://leetcode.com/problems/subarrays-with-k-different-integers/description/
public class SubArrWithKDifInt {
	public static void main(String[] args) {
		int nums[] = {1,2,1,2,3};
		int k = 2;
		System.out.println(subarraysWithKDistinct(nums, k));
	}

	public static int subarraysWithKDistinct(int[] nums, int k) {
		return subFunc(nums, k) - subFunc(nums, k-1);
	}
	
	public static int subFunc(int[] nums, int k) {
			
			int left =0;
			int right =0;
			int count =0;
			HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
			while(right < nums.length) {
				hm.put(nums[right], hm.getOrDefault(nums[right], 0)+1);
				
				while(hm.size() > k) {
					hm.put(nums[left], hm.get(nums[left]) - 1);
					
					if(hm.get(nums[left]) == 0) {
						hm.remove(nums[left]);
					}
						left++;
					
				}
				count = count + (right - left + 1);
				right++;
			}
			
		return count;
	}
}

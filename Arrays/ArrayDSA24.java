package Arrays;

import java.util.Arrays;

//1464. Maximum Product of Two Elements in an Array
public class ArrayDSA24 {
	public static void main(String[] args) {

		int nums[] = {3,7};
		int max = 0;
		int x =0;
		int y=0;

		for(int i=0; i<nums.length; i++) {
			nums[i] = nums[i]-1;
		}
		Arrays.sort(nums);
		x = nums[nums.length-1];
		y = nums[nums.length-2];

		max = x*y;
		System.out.println(max);
	}
}

package ArraysAndHashing;

import java.util.HashSet;

public class ArraysAndHashing1 {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 1 };
		System.out.println(containsDuplicate(arr));
	}

	public static boolean containsDuplicate(int[] nums) {
		HashSet<Integer> hs = new HashSet<Integer>();

		for (int var : nums) {
			hs.add(var);
		}

		if (nums.length == hs.size()) {
			return false;
		}
		return true;
	}
}

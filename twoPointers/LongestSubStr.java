package twoPointers;

import java.util.HashMap;

// https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
public class LongestSubStr {
	public static void main(String[] args) {
		String s = "abcabcbb";
		System.out.println(lengthOfLongestSubstring(s));
	}

	public static  int lengthOfLongestSubstring(String s) {

		int left=0;
		int right=0;
		int maxlength=0;
		char[] ch = s.toCharArray();

		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		while(right<s.length()) {

			if(hm.containsKey(ch[right])) {
				if(hm.get(ch[right])>=left) {
				left = hm.get(ch[right])+1;
			}
		}
		maxlength = Math.max(maxlength, right-left+1);
		hm.put(ch[right], right);
		right++;

	}

	return maxlength;
}
}

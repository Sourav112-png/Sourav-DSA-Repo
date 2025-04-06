package twoPointers;

// https://leetcode.com/problems/longest-repeating-character-replacement/
public class Longrepcharreplace {
	public static void main(String[] args) {
		String s = "AABABBA";
		int k = 2;
		System.out.println(characterReplacement(s, k));
	}

	public static int characterReplacement(String s, int k) {
		int freq[] = new int[26];
		int left = 0;
		int maxfreq = 0;
		int maxlength = 0;
		
		for(int right = 0; right<s.length(); right++) {
			freq[s.charAt(right) - 'A']++;
			maxfreq = Math.max(maxfreq, freq[s.charAt(right) - 'A']);
			int windowlength = right - left + 1;
			if(windowlength - maxfreq > k) {
				freq[s.charAt(left) - 'A']--;
				left++;
			}
			windowlength = right - left + 1;
			maxlength = Math.max(maxlength, windowlength);
		}
		
		return maxlength;
	}
}

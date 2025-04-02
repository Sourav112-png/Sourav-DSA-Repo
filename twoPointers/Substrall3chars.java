package twoPointers;


// https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/description/
public class Substrall3chars {
	public static void main(String[] args) {
		String str = "abcabc";
		System.out.println(numberOfSubstrings(str));
	}

	public static int numberOfSubstrings(String s) {

		int lastseen[] = {-1, -1, -1};
		int len = s.length();
		int count = 0;

		for(int i =0; i<len; i++) {
			lastseen[s.charAt(i) - 'a'] = i;
			
			count+= 1 + Math.min(lastseen[0], Math.min(lastseen[1], lastseen[2]));
		}

		return count;

	}

}

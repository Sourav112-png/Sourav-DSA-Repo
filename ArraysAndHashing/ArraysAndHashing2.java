package ArraysAndHashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

//242. Valid Anagram 

public class ArraysAndHashing2 {
	public static void main(String[] args) {
		System.out.println(isAnagram("aacc", "ccac"));
	}
	
	public static boolean isAnagram(String s, String t) {

		char[] c1 = s.toCharArray();
		char[] c2 = t.toCharArray();

		Arrays.sort(c1);
		Arrays.sort(c2);
		
		if(Arrays.equals(c1, c2)) {
			return true;
		}
		return false;

	}
	
	
	/*
	 * public static boolean isAnagram(String s, String t) { ArrayList<Character>
	 * list1 = new ArrayList<Character>(); ArrayList<Character> list2 = new
	 * ArrayList<Character>();
	 * 
	 * char[] c1 = s.toCharArray(); char[] c2 = t.toCharArray();
	 * 
	 * for (char var1 : c1) { list1.add(var1); } for (char var2 : c2) {
	 * list2.add(var2); } if (list1.size() == list2.size()) { if
	 * (list1.containsAll(list2)) { return true; } } return false;
	 * 
	 * }
	 */

	/*
	 * public static boolean isAnagram(String s, String t) { HashSet<Character> hs1
	 * = new HashSet<Character>(); HashSet<Character> hs2 = new
	 * HashSet<Character>();
	 * 
	 * char[] c1 = s.toCharArray(); char[] c2 = t.toCharArray();
	 * 
	 * for (char var1 : c1) { hs1.add(var1); } for (char var2 : c2) { hs2.add(var2);
	 * } if (hs1.size() == hs2.size()) { if (hs1.containsAll(hs2)) { return true; }
	 * } return false;
	 * 
	 * }
	 */
}

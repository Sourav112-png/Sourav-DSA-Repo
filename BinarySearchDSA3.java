package Searching;

//744 find the smallest letter greater than target.

public class BinarySearchDSA3 {

	static char ceilNumber(char letters[], char target) {
		
		int start=0;
		int end = letters.length-1;
		
		while(start<=end) {
			int mid = start + (end - start)/2; 

			if(target < letters[mid]) {
				end = mid - 1;
			}
			else {
				start = mid + 1;
			}
		}
		return letters[start % letters.length];////////very clever coding for finding the next value of an array.
	}

	public static void main(String[] args) {
		char target = 'z';
		char letters[] = {'v', 'x', 'y', 'y', 'z'};
		char ans = ceilNumber(letters, target);
		System.out.println(ans);
	}
}

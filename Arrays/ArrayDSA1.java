package Arrays;

import java.util.Arrays;

//Find the integer added to an array
public class ArrayDSA1 {

	public static void main(String[] args) {
		int[] arr1 = {4,2,6};
		int[] arr2 = {9,7,5};

		int x;
		int ans;
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		x = arr2[0]-arr1[0];
	for(int i=0; i<arr1.length; i++) {
		if(arr2[i]-arr1[i]!=x) {
		System.out.println("error");
	    }
		ans = arr2[i] - arr1[i];
		System.out.println(ans);
	}
}
}

package Searching;

import java.util.ArrayList;
import java.util.List;

//Even Digits
public class LinearSearch5 {
public static void main(String[] args) {
	int arr[] = {18,124,9,1764,98,1};
	int ans = linearSearch(arr);
	System.out.println(ans);
}

static int linearSearch(int[] arr) {
	int count = 0;
	if(arr.length == 0) {
		return -1;
	}
	for(int i=0 ;i<arr.length;i++) {
		int size = (int)(Math.log10(arr[i]))+1;///Imp
		if((size & 1) ==1){
			count++;
			

		}
	}

	return count;
}
}

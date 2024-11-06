package Searching;

//Base code for linear Search
public class LinearSearch1 {
public static void main(String[] args) {
	int arr[] = {56,234,67,89,32,67,98,12,43};
	int target = 100;
	int ans = linearSearch(arr, target);
	System.out.println(ans);
}

static int linearSearch(int[] arr, int target) {
	if(arr.length == 0) {
		return -1;
	}
	
	for(int i=0; i<arr.length; i++) {
		if(arr[i] == target) {
			return i;
		}
	}
	return -1;
}
}

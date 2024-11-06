package Searching;

//Search in range [1,4]
public class LinearSearch3 {
public static void main(String[] args) {
	int arr[] = {6,23,-9,19,3,5,9,12,4};
	int target = 3;
	int ans = linearSearch(arr, target);
	System.out.println(ans);
}

static int linearSearch(int[] arr, int target) {
	if(arr.length == 0) {
		return -1;
	}
	
	for(int i=1; i<5; i++) {
		if(arr[i] == target) {
			return i;
		}
	}
	return -1;
}
}

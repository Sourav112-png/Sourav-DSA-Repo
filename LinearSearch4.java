package Searching;

//Find Maximum
public class LinearSearch4 {
public static void main(String[] args) {
	int arr[] = {6,23,-9,19,3,5,9,122,4};
	int max;
	int ans = linearSearch(arr);
	System.out.println(ans);
}

static int linearSearch(int[] arr) {
	int max = 0;
	if(arr.length == 0) {
		return -1;
	}
	
	for(int i=0; i<arr.length-1; i++) {
		if(arr[i] > arr[i+1]) {
			max = arr[i];
			 
		}
		
	}
	return max;
}
}

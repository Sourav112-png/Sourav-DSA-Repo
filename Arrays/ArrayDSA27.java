package Arrays;

import java.util.*;
//3131. Find the Integer Added to Array I
public class ArrayDSA27 {
	
public static void main(String[] args) {
	
	int nums1[] = {2,6,4};
	int nums2[] = {9,7,5};
	
	Arrays.sort(nums1);
	Arrays.sort(nums2);
	
	int x = nums2[0] - nums1[0];
	
	System.out.println(x);
}
}

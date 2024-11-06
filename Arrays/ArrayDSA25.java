package Arrays;

//2656. Maximum Sum With Exactly K Elements 
import java.util.Arrays;
import java.util.Collections;

public class ArrayDSA25 {
	public static void main(String[] args) {

		Integer nums[] = {1,2,3,4,5};

		int temp = 0;
		//Arrays.sort(nums, Collections.reverseOrder());
		for(int i = 0; i<nums.length; i++) {
			for(int j = i+1; j<nums.length; j++){
				if(nums[i]<nums[j]) {
					temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		int heighest = 0;
		int k =3;
		int max = 0;

		while(0<k) {
			heighest = nums[0];
			max = max+heighest;
			k--;
			heighest = heighest+1;
			nums[0] = heighest;
		}
		System.out.println(max);

	}
}


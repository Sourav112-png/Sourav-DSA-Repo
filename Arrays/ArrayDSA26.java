package Arrays;

//2535. Difference Between Element Sum and Digit Sum of an Array
import java.util.ArrayList;
import java.util.List;

public class ArrayDSA26 {
	public static void main(String[] args) {
		int[] nums = {1,15,6,3};
		List<Integer> ls1 = new ArrayList<>();
		int sum2 = 0;
		int sum1 = 0;

		for(int i=0;i<nums.length; i++) {
			sum1 =sum1+nums[i];
		}
		for(int i=0; i<nums.length;i++) {
			while (nums[i] > 0) {
				int remainder = nums[i] % 10;
				ls1.add(remainder);
				nums[i] = nums[i] / 10;
			}
		}
		for(Integer var : ls1) {
			sum2 = sum2+var;
		}
		System.out.println(sum1-sum2);
	}
}

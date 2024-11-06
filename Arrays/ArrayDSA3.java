package Arrays;

public class ArrayDSA3 {

	public static void main(String[] args) {
		int[] nums = {3,2,1,4,5,6,7};
		int inclen =1;
		int declen = 1;
		int incmaxlen = 1;
		int decmaxlen = 1;

		for(int i=1; i<nums.length;i++) {
			if(nums[i-1]<nums[i]) {
				inclen++;
			}
			else
				inclen=1;
			incmaxlen = Math.max(inclen,incmaxlen);
		}

		for(int i=1; i<nums.length; i++) {
			if(nums[i-1]>nums[i]) {
				declen++;
			}
			else
				declen=1;
			decmaxlen = Math.max(declen, decmaxlen);
		}

		System.out.println(Math.max(incmaxlen, decmaxlen));
	}
}

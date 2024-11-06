package Arrays;

//1827. Minimum Operations to Make the Array Increasing
public class ArrayDSA29 {
	public static void main(String[] args) {

		int nums[] = {1,5,2,4,1};
		int temp = 0;
		int sum[] = new int[nums.length-1];
		int ans = 0;

		for(int i =0; i<nums.length-1; i++) {
			if(nums[i]>=nums[i+1]) { 
				temp = nums[i]+1;
				sum[i] = temp - nums[i+1];
				nums[i+1] = temp;
			}
		}
		for(int i =0; i<sum.length; i++) {
			ans += sum[i];
		}
		System.out.println(ans);
	}
}

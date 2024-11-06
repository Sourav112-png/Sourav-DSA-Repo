package Arrays;

public class ArrayDSA28 {

	//2418. Sort the People
	public static void main(String[] args) {

		Integer height[] = {180,165,170};
		String names[] = {"Mary","John","Emma"};

		for(int i=0; i<height.length; i++) {
			for(int j=i+1; j<height.length;j++) {
				if(height[i]<height[j]) {
					int temp = height[i];
					String name = names[i];
					height[i] = height[j];
					names[i] = names[j];
					height[j] = temp;
					names[j] = name;
				}
			}
			System.out.print(names[i]+" ");
		}
	}
}

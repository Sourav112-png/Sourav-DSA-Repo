package Arrays;

public class ArrayDSA2 {
	public static void main(String[] args) {
		char[][] grid = {{'B','W','W'}, {'B', 'W', 'W'}, {'W', 'B', 'B'}};
		int count = 0;
		int white = 0;
		int black = 0;



		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {

				if(grid[i][j] == 'W') {

					white++;
				}
				else
					black++;
				if(grid[i+1][j] == 'w') {
					white++;
				}
				else
					black++;
			}

			if(white>=3 || black>=3) {
				System.out.println("true");
			}
			else
				System.out.println("false");

			
		}
		
	}
}

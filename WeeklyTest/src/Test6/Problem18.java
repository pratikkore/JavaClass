package Test6;

//18.	Print average of each row and column for 3x4 matrix 2D array. Data is already present 

public class Problem18 {

	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3, 12 }, { 4, 5, 6, 11 }, { 7, 8, 9, 10 } };

		for (int i = 0; i < a.length; i++) {
			int sum = 0;
			int avg = 0;
			for (int j = 0; j < a[i].length; j++) {

				sum = sum + a[i][j];
			}
			avg = sum / a[i].length;
			System.out.println(avg);
		}
	}

}

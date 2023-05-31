package marchWrritenTest;

//12	34	2	4

//2	90	11	0
//6	19	7	9
//66	41	22	3

public class Problem15 {

	public static void main(String[] args) {
		int mat[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (i == 0 || j == 0 || i == mat.length - 1 || j == mat[i].length - 1) {
					System.out.print(mat[i][j]);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}

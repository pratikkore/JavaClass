package Day13Array2D;

public class ColomSum {

	public static void colomSum(int a[][]) {

		for (int i = 0; i < a.length; i++) {
			int sum = 0;
			for (int j = 0; j < a[i].length; j++) {
				sum = sum + a[j][i];
				System.out.print(a[i][j] + " ");
			}
			System.out.print("colom sum: " + sum);
			System.out.println();
		}

	}

	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		ColomSum.colomSum(a);

	}

}
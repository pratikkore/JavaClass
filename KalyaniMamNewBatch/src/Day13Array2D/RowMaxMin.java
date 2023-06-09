package Day13Array2D;

public class RowMaxMin {

	public static void rowMax(int a[][]) {

		for (int i = 0; i < a.length; i++) {
			int max = a[i][0];

			for (int j = 0; j < a[i].length; j++) {

				if (max < a[i][j]) {
					max = a[i][j];
				}
			}
			System.out.println("Maximum in " + (i + 1) + " row is  : " + max);

		}
	}

	public static void rowMin(int a[][]) {

		for (int i = 0; i < a.length; i++) {
			int min = a[i][0];

			for (int j = 0; j < a[i].length; j++) {

				if (min > a[i][j]) {
					min = a[i][j];
				}
			}
			System.out.println("Minimum in " + (i + 1) + " row is  : " + min);

		}
		System.out.println("**************************************************************");

	}

	public static void main(String[] args) {

		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		RowMaxMin.rowMin(a);
		RowMaxMin.rowMax(a);
	}

}

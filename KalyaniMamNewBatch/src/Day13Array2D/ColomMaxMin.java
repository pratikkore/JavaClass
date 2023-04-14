package Day13Array2D;

public class ColomMaxMin {

	public static void colomMin(int a[][]) {

		for (int i = 0; i < a.length; i++) {
			int min = a[i][0];

			for (int j = 0; j < a[i].length; j++) {

				if (min > a[i][j]) {
					min = a[i][j];
				}
			}
			System.out.println("minimum in " + (i + 1) + " coloum is  : " + min);

		}
		System.out.println("*********************************************************");
	}

	public static void colomMax(int a[][]) {

		for (int i = 0; i < a.length; i++) {
			int max = a[i][0];

			for (int j = 0; j < a[i].length; j++) {

				if (max < a[i][j]) {
					max = a[i][j];
				}
			}
			System.out.println("maximum in " + (i + 1) + " coloum is  : " + max);

		}
	}

	public static void main(String[] args) {

		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		ColomMaxMin.colomMin(a);
		ColomMaxMin.colomMax(a);
	}

}

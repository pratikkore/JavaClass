package Test4;

//12.) WAP to print maximum in rowwise in 2D array.
//Means e.g. arr[][] {{22, 31, 9}, {12, 25, 16}} output is: 31 and 25.

public class ArrayMaximum2d {

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
		int a[][] = { { 22, 31, 9 }, { 12, 25, 16 } };
		ArrayMaximum2d.colomMax(a);

	}

}

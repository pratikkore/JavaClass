package Day13Array2D;

import java.util.Scanner;

public class Create2DArray {

	public static void main(String[] args) {

		int a[][] = new int[2][2];
		int b[][] = new int[2][2];

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array Element....");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		Scanner cs = new Scanner(System.in);
		System.out.println("Enter the 2nd Array Element....");
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				b[i][j] = cs.nextInt();
			}
		}
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}

		int c[][] = new int[2][2];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {

				c[i][j] = a[i][j] + b[i][j];

			}
		}
		System.out.println("************************************************");
		System.out.println("Sum of matrix is ....");
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}

	}

}

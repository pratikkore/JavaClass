package classandobject;

import java.util.Scanner;

public class Patterns {
	Scanner sc = new Scanner(System.in);

	void starPattern(int r) {
		for (int i = 1; i <= r; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	void numberPattern(int r) {

		for (int i = 1; i <= r; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	void reversestarPattern(int r) {
		for (int i = r; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	void binaryPattern(int r) {
		for (int i = 1; i <= r; i++) {
			for (int j = 1; j <= i; j++) {

				System.out.print(j % 2 + " ");
			}
			System.out.println();
		}
	}

	void fibbinociPattern(int r) {

		int m = 0, n = 1;
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(m + " ");
				int o = m + n;
				n = m;
				m = o;
			}

			System.out.println();
		}
	}
}

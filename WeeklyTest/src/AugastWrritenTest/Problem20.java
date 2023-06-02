package AugastWrritenTest;

public class Problem20 {

	public static void main(String[] args) {
		int n = 5;
		for (int i = n; i >= 1; i--) {
			if (i % 2 == 0) {
				for (int j = 1; j <= i; j++) {
					System.out.print(j);
				}
			} else {
				for (int j = 65; j <= 65 + i - 1; j++) {
					System.out.print((char) j);
				}
			}
			System.out.println();
		}

		for (int i = 3; i <= n; i++) {
			if (i % 2 == 0) {
				for (int j = 1; j <= i; j++) {
					System.out.print(j);
				}
			} else {
				for (int j = 65; j <= 65 + i - 1; j++) {
					System.out.print((char) j);
				}
			}
			System.out.println();
		}
	}
}

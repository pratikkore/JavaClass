package PatternProg;

public class HighToLowPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int r = 4;

		for (int i = 1; i <= r; i++) {
			for (int l = 1; l <= r - i; l++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			for (int k = i - 1; k >= 1; k--) {
				System.out.print(k);
			}
			System.out.println();
		}
		for (int i = r - 1; i >= 1; i--) {
			for (int l = 1; l <= r - i; l++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			for (int k = i - 1; k >= 1; k--) {
				System.out.print(k);
			}
			System.out.println();
		}
	}

}

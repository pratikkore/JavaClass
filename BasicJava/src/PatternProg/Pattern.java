package PatternProg;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r = 4;
		for (int i = 1; i <= r; i++) {
			for (int k = 1; k <= r - i; k++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}

			for (int l = 3; l >= 1; l--) {
				for (int m = 1; m <= 3 - l; m++) {
					System.out.print(" ");
				}

				for (int n = 1; n <= l; n++) {
					System.out.print("* ");
				}
				System.out.println();
			}

		}

	}
}

//for (int i = 5; i >= 1; i--) {
//	for (int j = 1; j <= i; j++) {
//		System.out.print("*");
//	}
//	System.out.println();
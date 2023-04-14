package PatternProgram;

public class starPlus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		for (int i = 1; i <= n; i++) {
			if (i != n / 2) {
				for (int j = 1; j <= (n / 2) - 1; j++) {

					System.out.print("  ");
				}
				for (int j = n / 2; j <= n / 2; j++) {

					System.out.print("* ");
				}

				for (int j = (n / 2) + 1; j <= n; j++) {

					System.out.print("  ");
				}
			} else {
				for (int k = 1; k < n; k++) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}

	}

}

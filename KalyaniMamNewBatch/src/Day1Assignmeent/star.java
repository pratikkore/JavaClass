package Day1Assignmeent;

public class star {

	public static void main(String[] args) {
		// TODO Auto-generated method stubint
		int n = 6;
		int devide = n / 3;
		for (int i = 1; i <= n; i++) {
			if (i < 3) {
				for (int j = 1; j <= devide; j++) {
					System.out.print(" ");
				}
			} else {
				for (int j = 1; j <= devide; j++) {
					System.out.print("*");
				}
			}
			if ((n / 2) == i) {
				for (int j = devide; j <= (devide + devide); j++) {
					System.out.print("*");
				}
			}
			if (i > 3) {
				for (int j = (devide + devide); j <= n; j++) {
					System.out.print(" ");

				}
			} else {
				for (int j = 1; j <= devide; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}

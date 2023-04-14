//14. WAP to print following Pattern
//    *
//   * *
//  * * *
// * * * *
//* * * * *
// * * * *
//  * * *
//   * *
//    *

package PatternProgram;

public class FullPyramidStar14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {

			for (int k = 5; k >= i; k--) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int z = 5; z >= 1; z--) {

			for (int k = 5; k >= z; k--) {
				System.out.print(" ");
			}

			for (int j = 1; j <= z; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}

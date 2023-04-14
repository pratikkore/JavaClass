//1)
// *****
//  ****
//   ***
//    **
//     *

package PatternProgram;

public class FirstPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 5; i >= 1; i--) {

			for (int k = 5; k >= i; k--) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}

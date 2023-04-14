//8)
//         1
//        121
//       12321
//      1234321
//     123454321
//    12345654321
//   1234567654321
//  123456787654321
// 12345678987654321

package PatternProgram;

public class EightPatternProg {

	public static void main(String[] args) {
		for (int i = 1; i <= 8; i++) {

			for (int m = 8; m >= i; m--) {
				System.out.print(" ");
			}

			for (int k = 1; k <= i; k++) {
				System.out.print(k + "");
			}
			for (int j = i - 1; j >= 1; j--) {
				System.out.print(j + "");
			}

			System.out.println();
		}
	}

}

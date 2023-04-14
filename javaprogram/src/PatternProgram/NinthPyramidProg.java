//9) 12345678987654321
// 123456787654321
//  1234567654321
//   12345654321
//    123454321
//     1234321
//      12321
//       121
//        1

package PatternProgram;

public class NinthPyramidProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 8; i >= 1; i--) {

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

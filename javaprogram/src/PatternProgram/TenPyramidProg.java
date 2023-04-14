//         9
//        898
//       78987
//      6789876
//     567898765
//    45678987654
//   3456789876543
//  234567898765432
// 12345678987654321

package PatternProgram;

public class TenPyramidProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 9; i >= 1; i--) {

			for (int m = 1; m <= i; m++) {
				System.out.print(" ");
			}

			for (int k = i; k <= 9; k++) {
				System.out.print(k + "");
			}
			for (int j = 9 - 1; j >= i; j--) {
				System.out.print(+j + "");
			}

			System.out.println();
		}
	}

}

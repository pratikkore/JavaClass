//6)
//     	  1
//        1 2
//       1 2 3
//      1 2 3 4
//     1 2 3 4 5
//    1 2 3 4 5 6
//   1 2 3 4 5 6 7

package PatternProgram;

public class NumberPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 7; i++) {

			for (int k = 7; k >= i; k--) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}

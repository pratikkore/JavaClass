//21	WAP to print following Pattern
//	0 0 0 0 0
//	0 1 0 0 0
//	0 0 2 0 0
//	0 0 0 3 0
//	0 0 0 0 4

package PatternProgram;

public class TwentyOne21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == j) {
					System.out.print(i);
				} else {
					System.out.print("0");
				}

			}
			System.out.println();
		}

	}

}

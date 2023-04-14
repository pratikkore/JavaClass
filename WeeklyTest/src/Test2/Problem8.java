package Test2;

public class Problem8 {

//    1 2 3 4 5
//      1 2 3 4
//        1 2 3
//          1 2
//            1

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 5; i >= 1; i--) {

			for (int k = 5; k >= i; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}

//20	WAP to print following Pattern
//	1 1 1 1 1
//	1 1 1 2 2
//	1 1 3 3 3
//	1 4 4 4 4
//	5 5 5 5 5
//

package PatternProgram;

public class Twenty20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print("1");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

}

//19	WAP to print following Pattern
//	1 0 1 0 1
//	0 1 0 1 0
//	1 0 1 0 1
//	0 1 0 1 0
//	1 0 1 0 1

package PatternProgram;

public class Nintyeen19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {
			for (int j = i; j <= 5 + i; j++) {
				System.out.print(j % 2 + " ");
			}
			System.out.println();
		}
	}

}

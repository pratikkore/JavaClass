//5) Diamond number pattern with star border 
//* 
//*1* 
//*121* 
//*12321* 
//*1234321* 
//*123454321* 
//*1234321* 
//*12321* 
//*121* 
//*1*
//

package PatternProgram;

public class DimondNumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*");

		for (int i = 1; i <= 5; i++) {
			System.out.print("*");
			for (int k = 1; k <= i; k++) {
				System.out.print(k);
			}
			for (int j = i - 1; j >= 1; j--) {
				System.out.print(j);
			}

			System.out.println("*");
		}

		for (int i = 4; i >= 1; i--) {
			System.out.print("*");

			for (int k = 1; k <= i; k++) {
				System.out.print(k);
			}
			for (int j = i - 1; j >= 1; j--) {
				System.out.print(j);
			}

			System.out.println("*");
		}
		System.out.print("*");

	}

}

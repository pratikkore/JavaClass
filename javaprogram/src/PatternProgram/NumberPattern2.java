//
//2) Print pattern /3) 
//1 
//12 
//123 
//1234 
//12345 
//1234 
//123 
//12 
//

package PatternProgram;

import java.util.Scanner;

public class NumberPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user input =");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		for (int k = n - 1; k >= 1; k--) {
			for (int j = 1; j <= k; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}

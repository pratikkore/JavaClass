//14.find power while loop 
package AssigmentOnLooping;

import java.util.Scanner;

public class FindPowerWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Base Number =");
		int a = sc.nextInt();

		System.out.println("Enter Your Base Number =");
		int b = sc.nextInt();
		int ans = 0;
		while (a != 0) {
			ans = a * b;
			System.out.println(ans);
			break;
		}

	}

}

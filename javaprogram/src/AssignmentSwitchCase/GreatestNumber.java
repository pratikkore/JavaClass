//10)find which is greatest  number in between 2 numbers  using switch.

package AssignmentSwitchCase;

import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your First Number : ");
		int a = sc.nextInt();
		System.out.println("Enter Your Second Number : ");
		int b = sc.nextInt();

		int great = a > b ? 0 : 1;

		switch (great) {

		case 0:
			System.out.println(a + " is greatest number");
			break;
		case 1:
			System.out.println(b + " is greatest number");
			break;

		default:
			System.out.println("wrong input");
			break;
		}

	}

}

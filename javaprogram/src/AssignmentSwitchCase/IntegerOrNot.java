//For any integer input not between 1 to 7 it should display "error, day does not exist"

package AssignmentSwitchCase;

import java.util.Scanner;

public class IntegerOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int userNumber;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number :");

		userNumber = sc.nextInt();

		switch (userNumber) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
			System.out.println("This is valid Number ");
			break;

		default:
			System.out.println("error , day does not exist ");
			break;
		}

	}

}

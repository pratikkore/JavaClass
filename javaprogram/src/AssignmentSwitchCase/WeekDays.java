package AssignmentSwitchCase;

import java.util.Scanner;

public class WeekDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Day : ");
		int a = sc.nextInt();

		switch (a) {

		case 1:
			System.out.println("Monday");
			break;

		case 2:
			System.out.println("Thusaday");
			break;

		case 3:
			System.out.println("Wednsaday");
			break;

		case 4:
			System.out.println("Friday");
			break;

		case 5:
			System.out.println("Saturday");
			break;

		case 6:
			System.out.println("Sunday");
			break;

		default:
			System.out.println("Please Enter Valid Day ");

		}
	}

}

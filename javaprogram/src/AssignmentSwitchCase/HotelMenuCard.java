package AssignmentSwitchCase;

import java.util.Scanner;

public class HotelMenuCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Paneer 120rs");
		System.out.println("Mashroom 200rs");
		System.out.println("mixVeg 120rs");
		System.out.println("Dal 90rs");
		System.out.println("enter Your Action Choice");
		int ch = sc.nextInt();

		switch (ch) {
		case 1:
			System.out.println("Enter your Quntity ");
			int a = sc.nextInt();
			System.out.println("Your total Bill is " + (a * 150));
			break;

		case 2:
			System.out.println("Enter your Quntity ");
			int b = sc.nextInt();
			System.out.println("Your total Bill is " + (b * 200));
			break;

		case 3:
			System.out.println("Enter your Quntity ");
			int c = sc.nextInt();
			System.out.println("Your total Bill is " + (c * 120));
			break;

		case 4:
			System.out.println("Enter your Quntity ");
			int d = sc.nextInt();
			System.out.println("Your total Bill is " + (d * 90));
			break;
		default:
			System.out.println("Enter Valid Option");
			break;
		}
	}
}

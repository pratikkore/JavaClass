package DoWhile;

import java.util.Scanner;

public class HotelDriven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char za;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("1.Paneer 120rs");
			System.out.println("2.Mashroom 200rs");
			System.out.println("3.mixVeg 120rs");
			System.out.println("4.Dal 90rs");
			System.out.println("");
			System.out.println("enter Your Action Choice =");
			int ch = sc.nextInt();

			switch (ch) {
			case 1:
				System.out.println("Enter your Quntity= ");
				int a = sc.nextInt();
				System.out.println("Your total Bill is " + (a * 150));
				break;

			case 2:
				System.out.println("Enter your Quntity =");
				int b = sc.nextInt();
				System.out.println("Your total Bill is " + (b * 200));
				break;

			case 3:
				System.out.println("Enter your Quntity = ");
				int c = sc.nextInt();
				System.out.println("Your total Bill is " + (c * 120));
				break;

			case 4:
				System.out.println("Enter your Quntity = ");
				int d = sc.nextInt();
				System.out.println("Your total Bill is " + (d * 90));
				break;
			default:
				System.out.println("Enter Valid Option");
				break;
			}
			System.out.println("If you want agian press Y/N");
			za = sc.next().charAt(0);
		} while (za == 'Y' || za == 'y');

	}

}

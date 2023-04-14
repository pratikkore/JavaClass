package Day1;

import java.util.Scanner;

public class MovieBooking {
	String name, movieName;
	int age, choice, cCode, cod1;
	int price, discoun;

	public void Display() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user name - ");
		name = sc.next();
		System.out.println("Enter user age -");
		age = sc.nextInt();
		System.out.println("1.RRR =ticket price 200");
		System.out.println("2.Money Heist =ticket price 400");
		System.out.println("3.Sucide Squad =ticket price 500");

		System.out.println("Enter Movie Name -");
		choice = sc.nextInt();

		switch (choice) {
		case 1:
			Discount();
			System.out.println("Your selcted RRR Movie Total Ticket  Price is = " + (200 - discoun));
			break;

		case 2:
			Discount();
			System.out.println("Your selcted Money Heist  Movie Total Ticket  Price is = " + (400 - discoun));
			break;

		case 3:
			Discount();
			System.out.println("Your selcted Sucide Squad  Movie Total Ticket  Price is = " + (500 - discoun));
			break;

		}
	}

	public void Discount() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Coupan Code 1.yes 0.no : ");
		cCode = sc.nextInt();
		if (cCode == 1) {
			System.out.println("Enter coupan code number ");
			int cupCode = sc.nextInt();
			if (cupCode == 1234) {
				discoun = 54;
			}
		} else {
			System.out.println("no any coupan added");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovieBooking obj = new MovieBooking();
		obj.Display();
	}

}

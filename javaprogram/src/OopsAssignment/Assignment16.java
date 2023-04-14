package OopsAssignment;

import java.util.Scanner;

public class Assignment16 {

//	16). National game of India is Hockey, China is Table Tennis, Bangladesh is Kabaddi, Italy is Football,
//	United States is baseball. Write a Java program to read country name as user-input and to print the
//	country’s national game. Use switch

	public void switchcase(String input) {

		switch (input) {
		case "india":
			System.out.println("National game of india is Hockey ");
			break;

		case "China":
			System.out.println("National game of China is Table Tennis ");
			break;

		case "Bangladesh":
			System.out.println("National game of Bangladesh is Kabbadi ");
			break;

		case "italy":
			System.out.println("National game of italy is Football ");
			break;

		default:
			System.out.println("Please enter valid input...");

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Assignment16 obj = new Assignment16();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Country Name ...");
		String country = sc.next();

		obj.switchcase(country);
	}

}

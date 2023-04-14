package BasicJava;

import java.util.Scanner;

public class DigitOrChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char input;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user value :");
		input = sc.next().charAt(0);

		if (input >= 'A' && input <= 'Z') {
			System.out.println("This is a upper case character ");
		} else if (input >= 'a' && input <= 'z') {
			System.out.println("This is lower case character");
		} else {
			System.out.println("this is digit");
		}
		sc.close();

	}

}

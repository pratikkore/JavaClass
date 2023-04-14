package BasicJava;

import java.util.Scanner;

public class SingleOrDoubleDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Float number;

		@SuppressWarnings("resource")
		Scanner singleOrDoubleScanner = new Scanner(System.in);
		System.out.println("Enter Your Number :");
		number = singleOrDoubleScanner.nextFloat();

		if (number < 9) {
			System.out.println("this number is Single digit");
		} else {
			System.out.println("this number is double digit");
		}

	}

}

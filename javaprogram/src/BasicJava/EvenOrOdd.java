package BasicJava;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float number;

		Scanner average = new Scanner(System.in);
		System.out.println("Enter Your Number :");
		number = average.nextFloat();

		if (number % 2 == 0 && number > 0) {
			System.out.println("this is even number");

		} else {
			System.out.println("this is odd number");
		}

	}

}

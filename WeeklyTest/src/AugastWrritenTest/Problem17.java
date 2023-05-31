package AugastWrritenTest;

import java.util.Scanner;

//17)WAP to find out frequency of each digit in given mobile number using only single loop.

public class Problem17 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a mobile number: ");
		String number = scanner.nextLine();

		int[] frequency = new int[10];

		for (int i = 0; i < number.length(); i++) {
			char digit = number.charAt(i);
			if (Character.isDigit(digit)) {
				int index = Character.getNumericValue(digit);
				frequency[index]++;
			}
		}

		System.out.println("Digit Frequency:");
		for (int i = 0; i < 10; i++) {
			System.out.println(i + ": " + frequency[i]);
		}
	}

}

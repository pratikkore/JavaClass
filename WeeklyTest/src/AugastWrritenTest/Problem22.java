package AugastWrritenTest;

import java.util.Scanner;

//22.	WAP to accept a number and check whether it is binary or not.
//If not  throw custom exception InvalidBinaryNumber

class InvalidBinaryNumber extends Exception {
	public InvalidBinaryNumber(String message) {
		super(message);
	}
}

public class Problem22 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input a number");
		String n = sc.next();

		try {
			if (!isBinaryNumber(n)) {
				throw new InvalidBinaryNumber("Invalid binary number!");
			}
			System.out.println("Valid binary number!");
		} catch (InvalidBinaryNumber e) {
			System.out.println(e.getMessage());
		}
	}

	private static boolean isBinaryNumber(String number) {
		for (char ch : number.toCharArray()) {
			if (ch != '0' && ch != '1') {
				return false;
			}
		}
		return true;
	}
}
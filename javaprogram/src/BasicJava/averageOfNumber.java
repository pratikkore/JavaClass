package BasicJava;

import java.util.Scanner;

public class averageOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float firstNumber, secondNumber, thirdNumber, FourthNumber, fifthNumber;

		Scanner average = new Scanner(System.in);
		System.out.println("Enter Your first Number :");
		firstNumber = average.nextFloat();
		System.out.println("Enter Your Second Number :");
		secondNumber = average.nextFloat();
		System.out.println("Enter Your Third Number :");
		thirdNumber = average.nextFloat();
		System.out.println("Enter Your 4th Number :");
		FourthNumber = average.nextFloat();
		System.out.println("Enter Your 5th Number:");
		fifthNumber = average.nextFloat();

		System.out.println((firstNumber + secondNumber + thirdNumber + FourthNumber + fifthNumber) / 5);

	}

}

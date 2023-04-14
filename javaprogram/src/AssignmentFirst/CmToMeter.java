//6. Write a Java program to enter length in centimeter and convert it into meter and kilometer.
package AssignmentFirst;

import java.util.Scanner;

public class CmToMeter {
	public static void main(String[] args) {

		float length;

		@SuppressWarnings("resource")
		Scanner cmToMet = new Scanner(System.in);
		System.out.println("Enter your length:");
		length = cmToMet.nextFloat();

		System.out.println("length cm to  meter : " + (0.01f * length) + "meter");
		System.out.println("length cm to kilometer : " + (0.00001f * length) + "km");

	};
};
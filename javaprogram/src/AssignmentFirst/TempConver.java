//7. Write a Java program to enter temperature in °Fahrenheit and convert it into °Celsius.
package AssignmentFirst;

import java.util.Scanner;

public class TempConver {
	public static void main(String[] args) {

		float Temp;

		@SuppressWarnings("resource")
		Scanner Convert = new Scanner(System.in);
		System.out.println("Enter your Temprature:");
		Temp = Convert.nextFloat();

		System.out.println("Fahrenheit to Celsius : " + (Temp - 32) * 5 / 9);

	};
};
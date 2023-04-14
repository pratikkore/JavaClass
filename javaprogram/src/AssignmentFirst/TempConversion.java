//8. Write a Java program to enter temperature in °Celsius and convert it into °Fahrenheit.
package AssignmentFirst;

import java.util.Scanner;

public class TempConversion {
	public static void main(String[] args) {

		float Temp;

		@SuppressWarnings("resource")
		Scanner Convert = new Scanner(System.in);
		System.out.println("Enter your Temprature:");
		Temp = Convert.nextFloat();

		System.out.println("Celsius to  Fahrenheit : " + (Temp * 95) + 32);

	};
};
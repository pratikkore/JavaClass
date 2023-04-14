//5. Write a Java program to enter radius of a circle and find its diameter, circumference and area.

package AssignmentFirst;

import java.util.Scanner;

public class CircleParamters {
	public static void main(String[] args) {

		int radius;

		@SuppressWarnings("resource")
		Scanner circle = new Scanner(System.in);
		System.out.println("Enter your radius :");
		radius = circle.nextInt();

		System.out.println("Circle diameter is : " + 2 * radius);
		System.out.println("Circle circumference is : " + 2 * 3.14 * radius);

	};
};
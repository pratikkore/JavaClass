//3. Write a Java program to enter length and breadth of a rectangle and find its perimeter.

package AssignmentFirst;

import java.util.Scanner;

public class PerimeterOfRectangle {
	public static void main(String[] args) {

		int width, length;

		@SuppressWarnings("resource")
		Scanner rectangle = new Scanner(System.in);
		System.out.println("Enter Rectangle Width :");
		width = rectangle.nextInt();
		System.out.println("Enter Rectangle length :");
		length = rectangle.nextInt();

		System.out.println(" Perimeter of rectangle is :" + 2 * (width + length));

	}
}
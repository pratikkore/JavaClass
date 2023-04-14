//Write a Java program to enter length and breadth of a rectangle and find its area.

package AssignmentFirst;

import java.util.Scanner;

public class AreaOfRecangle {
	public static void main(String[] args) {

		int width, length;

		@SuppressWarnings("resource")
		Scanner rectangle = new Scanner(System.in);
		System.out.println("Enter your length :");
		width = rectangle.nextInt();
		System.out.println("Enter your width :");
		length = rectangle.nextInt();

		System.out.println(" rectangle area is :" + width * length);

	}
}
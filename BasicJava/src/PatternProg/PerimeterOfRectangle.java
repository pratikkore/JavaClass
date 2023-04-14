package PatternProg;

import java.util.Scanner;

public class PerimeterOfRectangle {
	public static void main(String[] args) {

		int breadth, length;

		@SuppressWarnings("resource")
		Scanner rectangle = new Scanner(System.in);
		System.out.println("Enter Rectangle Width :");
		breadth = rectangle.nextInt();
		System.out.println("Enter Rectangle length :");
		length = rectangle.nextInt();

		System.out.println(" Perimeter of rectangle is :" + 2 * (breadth + length));

	}
}
//14. Write a Java program to calculate area of an equilateral triangle.

package AssignmentFirst;

import java.util.Scanner;

public class EquilateralTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int side;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Side Of Equilateral triangle : ");
		side = sc.nextInt();

		System.out.println("Area of Equilateral Triangle is : " + (1.73205080757 / 4) * side * side);
	}

}

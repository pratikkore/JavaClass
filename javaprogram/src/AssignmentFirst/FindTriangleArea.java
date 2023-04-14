//13. Write a Java program to enter base and height of a triangle and find its area.

package AssignmentFirst;

import java.util.Scanner;

public class FindTriangleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base, height;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base of triangle : ");
		base = sc.nextInt();

		System.out.println("Enter height of triangle : ");
		height = sc.nextInt();

		System.out.println("Area of triangle is : " + 0.5 * (base * height));
	}
}

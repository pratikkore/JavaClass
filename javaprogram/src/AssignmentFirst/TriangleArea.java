//12. Write a Java program to enter two angles of a triangle and find the third angle.

package AssignmentFirst;

import java.util.Scanner;

public class TriangleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstAngle, secondAngle;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Triangle First angle : ");
		firstAngle = sc.nextInt();

		System.out.println("Enter Triangle Second angle : ");
		secondAngle = sc.nextInt();

		System.out.println("Third angle of triangle is : " + (180 - (firstAngle + secondAngle)));

	}

}

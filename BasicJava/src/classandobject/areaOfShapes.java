package classandobject;

import java.util.Scanner;

public class areaOfShapes {

	void areaOfCircle() {

		int radius;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your circle radius :");
		radius = sc.nextInt();

		System.out.println("area of circle is :" + 3.14f * radius * radius);
	}

	void areaOfSquare() {
		int side;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your squre side :");
		side = sc.nextInt();

		System.out.println("area of Square is :" + side * side);
	}

	void areaOfTriangle() {
		int base, height;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Triangle base :");
		base = sc.nextInt();
		System.out.println("Enter Triangle height :");
		height = sc.nextInt();

		System.out.println("area of triangle is :" + 0.5f * base * height);
	}

	void areaOfRectangle() {
		int width, length;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Reactangle  width :");
		width = sc.nextInt();
		System.out.println("Enter Reactangle length :");
		length = sc.nextInt();

		System.out.println("addition is :" + width * length);
	}
}

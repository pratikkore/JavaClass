//9.WAP in java using switch case for following: Area of a circle 
//Area of a square Area of a right angled triangle Area of a rectangle Circumference of a circle 
//Perimeter of a square Accept inputs like radius,side,etc through keyboard.
////Menu driven program using switch case:

package AssignmentSwitchCase;

import java.util.Scanner;

public class MenuDriven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int radius, side, width, length;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for find Area of a circle  ");
		System.out.println("Enter 2 for find Area of a square  ");
		System.out.println("Enter 3 for find Area of a right angled triangle  ");
		System.out.println("Enter 4 for find Area of a rectangle  ");
		System.out.println("Enter 5 for Circumference of a circle  ");
		System.out.println("Enter 6 for find Perimeter of a square ");

		System.out.println("Enter your choice - ");
		int num = sc.nextInt();

		switch (num) {

		case 1:
			System.out.println("Enter Radius of circle : ");
			radius = sc.nextInt();
			double ans = (3.14 * radius * radius);
			System.out.println("Area of circle of is : " + ans);
			break;

		case 2:
			System.out.println("Enter side of square : ");
			side = sc.nextInt();
			double ans2 = (3.14 * side * side);
			System.out.println("Area of a square  : " + ans2);
			break;

		case 3:
			System.out.println("Enter 1st leg side : ");
			System.out.println("Enter 2nd leg side : ");
			side = sc.nextInt();
			double area = ((side * side) / 2);
			System.out.println("Area of a right angled triangle : " + area);
			break;

		case 4:
			System.out.println("Enter width : ");
			System.out.println("Enter length : ");
			width = sc.nextInt();
			length = sc.nextInt();
			double rectangle = (width * length);
			System.out.println("find Area of a rectangle : " + rectangle);
			break;

		case 5:
			System.out.println("Enter Radius of circle : ");
			radius = sc.nextInt();
			double circle = (6.28 * radius);
			System.out.println("find Circumference of a circle : " + circle);
			break;
		case 6:
			System.out.println("Enter side of square : ");
			side = sc.nextInt();
			double square = (4 * side);
			System.out.println("Perimeter of a square : " + square);
			break;

		}

	}

}

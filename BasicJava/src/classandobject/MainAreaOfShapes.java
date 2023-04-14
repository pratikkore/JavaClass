package classandobject;

import java.util.Scanner;

public class MainAreaOfShapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		areaOfShapes obj = new areaOfShapes();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Select one Shape for Finding Area ......");
		System.out.println("1.AreaOfCircle =");
		System.out.println("2.AreaOfSquare=");
		System.out.println("3.AreaOfTrinagle=");
		System.out.println("4.AreaOfReactngle =");
		int area = sc.nextInt();

		switch (area) {
		case 1:

			obj.areaOfCircle();
			break;

		case 2:
			obj.areaOfSquare();
			break;

		case 3:
			obj.areaOfTriangle();
			break;

		case 4:
			obj.areaOfRectangle();
			break;
		}
	}

}

package BasicJava;

import java.util.Scanner;

public class AreaOfCircle {
	public static void main(String[] args) {

		int radius;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your 1st Number :");
		radius = sc.nextInt();

		System.out.println("area of circle is :" + 3.14f * radius * radius);

	}
}
package BasicJava;

import java.util.Scanner;

public class AreaOfTriangle {
	public static void main(String[] args) {

		int base, height;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your 1st Number :");
		base = sc.nextInt();
		System.out.println("Enter your 2nd Number :");
		height = sc.nextInt();

		System.out.println("area of triangle is :" + 0.5f * base * height);

	}
}
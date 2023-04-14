package Day1;

import java.util.Scanner;

public class FindAreaOfTriangle {
	public static void main(String[] args) {
		int base, height;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your base :");
		base = sc.nextInt();
		System.out.println("Enter your height :");
		height = sc.nextInt();

		System.out.println("area of triangle is :" + 0.5f * base * height);
	}
}

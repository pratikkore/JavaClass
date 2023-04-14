package BasicJava;

import java.util.Scanner;

public class DynamicUserInput {
	public static void main(String[] args) {

		int a, b;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your 1st Number :");
		a = sc.nextInt();
		System.out.println("Enter your 2nd Number :");
		b = sc.nextInt();

		System.out.println("addition is :" + (a + b));

	}
}

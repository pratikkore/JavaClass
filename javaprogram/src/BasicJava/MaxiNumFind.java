package BasicJava;

import java.util.Scanner;

public class MaxiNumFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A, B;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		A = sc.nextInt();

		System.out.println("Enter second number : ");
		B = sc.nextInt();

		if (A > B) {
			System.out.println("First Entered Number is maximum ");
		} else {
			System.out.println("Second Entered Number is maximum");
		}
	}

}

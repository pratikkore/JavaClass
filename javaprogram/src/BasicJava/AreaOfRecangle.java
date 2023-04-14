package BasicJava;

import java.util.Scanner;

public class AreaOfRecangle {
	public static void main(String[] args) {

		int width, length;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your 1st Number :");
		width = sc.nextInt();
		System.out.println("Enter your 2nd Number :");
		length = sc.nextInt();

		System.out.println("addition is :" + width * length);

	}
}
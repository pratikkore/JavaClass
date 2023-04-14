package BasicJava;

import java.util.Scanner;

public class ReverserWhileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter numb");

		int num = sc.nextInt();
		int rev = 0;

		while (num != 0) {
			int r = num % 10;
			rev = rev * 10 + r;
			num = num / 10;
		}
		System.out.println("Reverse num is: " + rev);
	}

}

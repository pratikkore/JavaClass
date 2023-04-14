package BasicJava;

import java.util.Scanner;

public class MultiplicationOfdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number -");
		int num = sc.nextInt();
		int m = 1;
		while (num != 0) {

			int r = num % 10;
			if (r % 2 == 1) {
				m = m * r;
			}
			num = num / 10;
		}
		System.out.println(m);

	}

}

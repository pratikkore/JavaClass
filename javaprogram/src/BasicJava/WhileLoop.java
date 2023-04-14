package BasicJava;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int limit, s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Limit");
		limit = sc.nextInt();

		System.out.println("Enter end Poinit");
		s = sc.nextInt();

		while (s <= limit) {
			System.out.print(s);
			s++;
		}
	}

}

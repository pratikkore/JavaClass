package BasicJava;

import java.util.Scanner;

public class WhileLoopReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int limit, s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Limit- ");
		limit = sc.nextInt();

		Scanner ac = new Scanner(System.in);
		System.out.println("Enter Your Count -");
		s = ac.nextInt();

		while (limit >= s) {
			System.out.println(limit);
			limit--;
		}
	}

}

package BasicJava;

import java.util.Scanner;

public class switchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Charchter : ");

		char ch = sc.next().charAt(0);

		switch (ch) {
		case 'a':
			System.out.println("this is vowels ");
			break;

		case 'e':
			System.out.println("this is vowels");
			break;

		case 'i':
			System.out.println("this is vowels");
			break;

		case 'o':
			System.out.println("this is vowels");
			break;

		case 'u':
			System.out.println("this is vowels");

		default:
			System.out.println(" this is constant");
		}
	}

}

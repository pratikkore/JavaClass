//7. Write a Java program to enter number between 1to 5 and print it in word

package AssignmentSwitchCase;

import java.util.Scanner;

public class ValidNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userNumber;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number :");

		userNumber = sc.nextInt();

		switch (userNumber) {
		case 1:
			System.out.println("user enter number is one  ");
			break;

		case 2:
			System.out.println("user enter number is two  ");
			break;

		case 3:
			System.out.println("user enter number is three  ");
			break;

		case 4:
			System.out.println("user enter number is four  ");
			break;

		case 5:
			System.out.println("user enter number is five  ");
			break;

		default:
			System.out.println("error , Does not enter correct number ");
			break;
		}

	}
}

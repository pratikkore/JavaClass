//2.Write a Java program to check whether a number is even or odd using switchcase 

package AssignmentSwitchCase;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number : ");
		num = sc.nextInt();
		switch (num % 2) {
		case 0:
			System.out.println(num + " is a Even number");
			break;
		case 1:
			System.out.println(num + " is a Odd number");

		}

	}

}

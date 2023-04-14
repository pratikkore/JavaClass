//1. Write a Java program to enter two numbers and find their sum.

package AssignmentFirst;

import java.util.Scanner;

public class SumTwoNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;

		@SuppressWarnings("resource")
		Scanner add = new Scanner(System.in);
		System.out.println("Enter 1st Number : ");
		num1 = add.nextInt();
		System.out.println("Enter 2nd Number : ");
		num2 = add.nextInt();

		System.out.println("Sum of These Two Number = " + (num1 + num2));
	}

}

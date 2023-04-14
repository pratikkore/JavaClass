package BasicJava;

import java.util.Scanner;

public class SwitchCaseUserAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println("1.Addition\n2.Multiplication \n3.divison\n4.Substraction");

		System.out.println("enter Your Action Choice");
		int ch = sc.nextInt();

		switch (ch) {
		case 1:
			System.out.println("Addition of this two number is " + (a + b));
			break;

		case 2:
			System.out.println("multiplication of this two number is " + (a * b));
			break;

		case 3:
			System.out.println("Division of this two number is " + (a / b));
			break;

		case 4:
			System.out.println("Substraction of this two number is " + (a - b));
			break;

		}
	}

}

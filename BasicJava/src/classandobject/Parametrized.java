package classandobject;

import java.util.Scanner;

final class Parametrized {
	Scanner sc = new Scanner(System.in);

	void sum(int a, int b) {
		System.out.println("Sum Of these number= " + (a + b));
	}

	void substraction(int a, int b) {
		System.out.println("Substraction of these number =" + (a - b));
	}

	void divide(int a, int b) {
		Scanner sc = new Scanner(System.in);
		while (b == 0 || b < 0) {
			System.out.println("enter non zero or positive number= ");
			b = sc.nextInt();
		}
	}
}

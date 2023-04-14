package BasicJava;

import java.util.Scanner;

public class TotalDigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number, total = 0, sum = 0, temp = 0;
		char ch = '0';
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter User Number = ");
			number = sc.nextInt();
			do {
				if (sum != 0) {

					if (temp > total) {
						sum = temp;
						total = number % 10;
					} else {
						sum = total;
						temp = number % 10;
					}
					number = number / 10;
				} else {
					total = number % 10;
					number = number / 10;
					temp = number % 10;
					if (temp > total) {
						sum = temp;
						total = number % 10;
					} else {
						sum = total;
						temp = number % 10;
					}
				}
//				sum = sum + total;

			} while (number > 0);

			System.out.println("Largest digit in number is  = " + sum);
			sum = 0;
			System.out.println("Enter another input y/n");
			ch = sc.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');
		System.out.println("Thank you");
	}
}

package AugastWrritenTest;

import java.util.Scanner;

public class Problem8 {
	int sumDig(int n) {
		int a = 0;
		while (n > 0) {
			a = a + n % 10;
			n = n / 10;
		}
		return a;
	}

	public static void main(String[] args) {
		Problem8 ob = new Problem8();
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a 15 digit IMEI code : ");
		long n = sc.nextLong();

		String s = Long.toString(n);
		int l = s.length();

		if (l != 15)
			System.out.println("Output : Invalid Input");
		else {
			int d = 0, sum = 0;
			for (int i = 15; i >= 1; i--) {
				d = (int) (n % 10);
				if (i % 2 == 0) {

					d = 2 * d;
				}
				sum = sum + ob.sumDig(d);
				n = n / 10;
			}
			System.out.println("Output : Sum = " + sum);
			if (sum % 10 == 0)
				System.out.println("Valid IMEI Code");
			else
				System.out.println("Invalid IMEI Code");
		}
	}
}

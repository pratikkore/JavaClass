package April8;

import java.util.Scanner;

public class ArrayPrime {

	public static boolean isPrime(int n) {
		int count = 0;
		boolean flage = false;

		for (int j = 1; j <= n; j++) {
			if (n % j == 0) {
				count++;
			}
		}

		if (count == 2 || n == 1) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

		int a[] = new int[5];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			if (isPrime(a[i])) {
				System.out.println(a[i]);
			}
		}
	}

}

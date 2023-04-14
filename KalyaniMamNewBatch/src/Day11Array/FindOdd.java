package Day11Array;

import java.util.Scanner;

public class FindOdd {

	public void Odd(int[] a) {
		int num = a[0];
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 1) {
				System.out.println(a[i]);
				sum = sum + a[i];
			}
		}
		System.out.println("Total sum of Odd Number is =" + sum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size ...");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter array element...");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		FindOdd obj = new FindOdd();
		obj.Odd(arr);
	}
}

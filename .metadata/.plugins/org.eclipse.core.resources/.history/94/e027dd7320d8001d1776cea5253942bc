package Day11Array;

import java.util.Scanner;

public class FindMinimum {

	public void Minimum(int[] a) {
		int num = a[0];
		int min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
				System.out.println(min);
			}
		}
		System.out.println(min);
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

		FindMinimum obj = new FindMinimum();

		obj.Minimum(arr);

	}
}

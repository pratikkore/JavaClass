package April8;

import java.util.Scanner;

public class NearrestNumber {

	public void display(int[] arr) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user input: ");
		int num = sc.nextInt();
		int r = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (Math.abs(num - r) > Math.abs(num - arr[i])) {
				r = arr[i];
			}
		}
		System.out.println(r);

	}

	public static void main(String[] args) {

		int arr[] = { 5, 9, 2, 7 };

		NearrestNumber obj = new NearrestNumber();

		obj.display(arr);
	}

}

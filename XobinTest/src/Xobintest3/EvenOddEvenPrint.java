package Xobintest3;

import java.util.Scanner;

public class EvenOddEvenPrint {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any 10 numbers...");
		int[] arr = new int[11];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int evenCount = 0, oddCount = 0;

		for (int i = oddCount; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}

		int even[] = new int[evenCount];
		int odd[] = new int[oddCount];

		int evenIndex = 0, oddIndex = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				even[evenIndex] = arr[i];
				evenIndex++;
			} else {
				odd[oddIndex] = arr[i];
				oddIndex++;
			}
		}
		evenIndex = 0;
		oddIndex = 0;

		int evenLength = even.length - 1;
		int oddLength = odd.length - 1;

		for (int i = 0; i < arr.length; i++) {

			if (i % 2 == 0 && evenIndex < even.length) {
				System.out.print(even[evenIndex] + " ");
				evenIndex++;
			} else if (oddIndex < odd.length) {
				System.out.print(odd[oddIndex] + " ");
				oddIndex++;
			}
			if ((evenIndex + oddIndex) == (evenLength + oddLength) && evenIndex + oddIndex < arr.length) {
				if (even.length > odd.length) {
					System.out.print(even[evenIndex] + " ");
					evenIndex++;
				} else {
					System.out.print(odd[oddIndex] + " ");
					oddIndex++;
				}
			}
		}
	}

}

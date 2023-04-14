package Day11Array;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6 };
//		for (int i = 1; i < arr.length; i++) {
//			System.out.println(arr[i]);

		int j = arr.length - 1;

		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			j--;
		}
		System.out.println(Arrays.toString(arr));

	}
}

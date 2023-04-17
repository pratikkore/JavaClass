package Test4;

import java.util.Arrays;

// Write a  program to separate zeros from non-zeros in an integer array?

//Input Array : [12, 0, 7, 0, 8, 0, 3]
//Input Array After moving zeros to end :
//[12, 7, 8, 3, 0, 0, 0]

public class NonZeroToZero {

	public static void main(String[] args) {

		int arr[] = { 12, 0, 7, 0, 8, 0, 3 };
		int count = 0;
		int fullLength[] = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] != 0) {
				fullLength[count] = arr[i];
				count++;
			}
		}
		System.out.println(Arrays.toString(fullLength));
	}
}

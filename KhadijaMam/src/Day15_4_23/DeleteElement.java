package Day15_4_23;

import java.util.Arrays;

public class DeleteElement {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int temp[] = new int[arr.length - 1];
		int tempIndex = 0;
		int deletPosition = 2;

		for (int i = 0; i < arr.length; i++) {
			if (i != deletPosition) {
				temp[tempIndex] = arr[i];
				tempIndex++;
			}
		}
		arr = temp;
		System.out.println(Arrays.toString(arr));
	}
}

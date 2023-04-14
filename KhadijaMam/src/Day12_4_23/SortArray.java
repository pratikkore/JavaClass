package Day12_4_23;

import java.util.Arrays;

public class SortArray {
	public void display(char[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1 + i; j < arr.length; j++) {
				if ((arr[i] < arr[j])) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = (char) temp;
				}
			}
			System.out.println(arr[i]);
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {

//		int arr[] = { 1, 4, 2, 5, 7, 3, 1, 1, 2 };

		char arr[] = { 'z', 'c', 'e', 'y', 'w', 'z', 'c', 'c' };

		SortArray obj = new SortArray();
		obj.display(arr);

	}

}

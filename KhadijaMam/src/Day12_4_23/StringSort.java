package Day12_4_23;

import java.util.Arrays;

public class StringSort {

	public void display(String arr[]) {

		String temp;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 1 + i; j < arr.length; j++) {
				if (arr[i].charAt(0) > arr[j].charAt(0)) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}

	public static void main(String[] args) {

		String arr[] = { "pune", "mumbai", "goa", "ahemdabad", "delhi","amravati" };

		StringSort obj = new StringSort();
		obj.display(arr);
	}

}

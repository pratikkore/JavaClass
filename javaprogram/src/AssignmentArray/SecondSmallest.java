package AssignmentArray;

import java.util.Arrays;

//WAP to find the second smallest element in an array.

public class SecondSmallest {

	public void display(int arr[]) {
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1 + i; j < arr.length; j++) {
				if ((arr[i] > arr[j])) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = (char) temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Second smallest number in array is  : " + arr[1]);

	}

	public static void main(String[] args) {

		int arr[] = { 8, 2, 1, 3, 5, 6, 7 };

		SecondSmallest obj = new SecondSmallest();
		obj.display(arr);
	}

}

package AssignmentArray;

import java.util.Arrays;

//WAP to find min character in character array. Means e.g. arr[] = [‘A’, ‘D’, ‘E’, ‘x’, ‘z’, ‘R’], so min character is ‘A’.

public class MinCharacter {

	public void display(char arr[]) {

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
		System.out.println("Minimum character in array is : " + arr[0]);
	}

	public static void main(String[] args) {

		char arr[] = { 'p', 'r', 'a', 't', 'i', 'k' };

		MinCharacter obj = new MinCharacter();

		obj.display(arr);

	}

}

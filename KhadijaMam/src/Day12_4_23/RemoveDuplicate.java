package Day12_4_23;

import java.util.Arrays;

public class RemoveDuplicate {

	public static void main(String[] args) {

		int index = 1;
		int arr[] = { 1, 2, 3, 4, 3, 2, 1 };
		int temp[] = new int[arr.length];

		temp[0] = arr[0];
		for (int i = 1; i < arr.length; i++) {

			for (int j = 0; j < temp.length; j++) {
				if (arr[i] != temp[j]) {
					temp[index] = arr[i];
//					System.out.println(temp[index]);
					index++;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(temp));
	}

}

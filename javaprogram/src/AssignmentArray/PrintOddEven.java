package AssignmentArray;

import java.util.Arrays;

public class PrintOddEven {

	public void display(int arr[]) {

		int evenCount = 0;
		int oddCount = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
//				even[i] = arr[i];
				evenCount++;
			} else {
				oddCount++;
			}
		}
		int odd[] = new int[oddCount];
		int even[] = new int[evenCount];

		int evenIndex = 0, oddIndex = 0;
//		System.out.println(evenCount);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				even[evenIndex] = arr[i];
				evenIndex++;
			} else {
//				
				odd[oddIndex] = arr[i];
				oddIndex++;
			}
		}
		System.out.println("Even Element in Array is : " + Arrays.toString(even));
		System.out.println("Odd Element in Array is  : " + Arrays.toString(odd));

	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		PrintOddEven obj = new PrintOddEven();
		obj.display(arr);
	}

}

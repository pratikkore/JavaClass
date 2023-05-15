package Day15_4_23;
import java.util.Arrays;

public class MergeTwoArray {

	public static void main(String[] args) {
		int arr1[] = { 1, 2, 3, 4, 5 };
		int arr2[] = { 6, 7, 8, 9, 10 };

		int merge[] = new int[arr1.length + arr2.length];

		for (int i = 0; i < arr1.length; i++) {
			merge[i] = arr1[i];
		}
		int mergeIndex = arr1.length;
		for (int i = 0; i < arr2.length; i++) {

			merge[mergeIndex] = arr2[i];
			mergeIndex++;
		}
		System.out.println(Arrays.toString(merge));
	}

}

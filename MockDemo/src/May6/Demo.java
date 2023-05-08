package May6;

import java.util.Arrays;

public class Demo {

	public void coonvert(char[] arr) {
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > 'A' && arr[i] <= 'Z') {
				arr[i] = (char) (arr[i] + 32);
			} else {
				arr[i] = (char) (arr[i] - 32);
			}
		}
		System.out.println(Arrays.toString(arr));

	}

	public static void main(String[] args) {

		char[] arr = { 'a', 'B', 'c', 'D', 'F', 'g' };

		Demo d = new Demo();
		d.coonvert(arr);
	}
}

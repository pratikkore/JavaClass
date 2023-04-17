package Test4;

public class MinimumFrequncyChar {

	public static void main(String[] args) {
		char arr[] = { 'a', 'b', 'b', 'c', 'b', 'a' };
		int count = 0, oldCount = 0;
		char minChar = 0;
		for (int i = 0; i < arr.length; i++) {
			count = 0;
			boolean isPresent = false;
			for (int j = 0; j < arr.length; j++) {

				if ((arr[i] == arr[j]) && i > j) {
					isPresent = true;
					break;
				}
				if ((arr[i] == arr[j])) {
					count++;
				}
			}
			if (!isPresent) {

				if (i == 0) {
					oldCount = count;
					minChar = arr[i];
				} else if (oldCount > count) {
					oldCount = count;
					minChar = arr[i];
				}

			}

		}
		System.out.println(minChar);
	}
}

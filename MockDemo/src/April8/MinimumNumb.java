package April8;

public class MinimumNumb {

	public static void main(String[] args) {

		int[] arr = { 2, 4, 5, 1 };
		int temp = arr[0];

		for (int i = 1; i < arr.length; i++) {

			int a = arr[i];

			if (temp > a) {
				temp = a;
			}
		}
		System.out.println(temp);

	}

}
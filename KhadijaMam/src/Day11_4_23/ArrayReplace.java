package Day11_4_23;

public class ArrayReplace {

	public void display(int arr[]) {
		int user = 30;
		int i;
		for (i = 0; i < arr.length; i++) {
			if (arr[i] == user) {
				arr[i] = 0;
			}
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 40, 30, 50, 30 };

		ArrayReplace obj = new ArrayReplace();
		obj.display(arr);

	}

}

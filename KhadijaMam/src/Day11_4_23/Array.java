package Day11_4_23;

public class Array {

	public void display(char arr[]) {

		int temp = 2;
		for (char i = 0; i < arr.length; i++) {

			if (arr[i] == 'y' || arr[i] == 'z') {
				arr[i] = (char) (arr[i] - 24);
			} else {
				arr[i] = (char) (arr[i] + temp);
			}
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {

		char arr[] = { 'a', 'e', 's', 'z' };

		Array obj = new Array();
		obj.display(arr);

	}

}

package Test4;

public class RemoveDuplicates {

	public void display(int arr[]) {

		for (int i = 0; i < arr.length; i++) {

			int j;

			for (j = 0; j < i; j++) {

				if (arr[i] == arr[j])
					break;
			}

			if (i == j)

				System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {

		int arr[] = { 4, 3, 2, 4, 9, 2 };

		RemoveDuplicates obj = new RemoveDuplicates();
		obj.display(arr);
	}

}

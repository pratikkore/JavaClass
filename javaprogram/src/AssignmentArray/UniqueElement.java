package AssignmentArray;

//WAP to print all unique elements in the array.

public class UniqueElement {

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

		int arr[] = { 7, 6, 5, 4, 3, 2, 1, 1, 2, 3, 4, 2, 1, 2, 3 };

		UniqueElement obj = new UniqueElement();
		obj.display(arr);
	}
}
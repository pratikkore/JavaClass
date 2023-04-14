package AssignmentArray;

//WAP to count frequency of each element in an array.

public class FindFrequancy {
	public void Display(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
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
			if (!isPresent)
				System.out.println(arr[i] + "--->" + count);
		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 5, 4, 3, 3, 2, 1 };

		FindFrequancy obj = new FindFrequancy();

		obj.Display(arr);
	}

}

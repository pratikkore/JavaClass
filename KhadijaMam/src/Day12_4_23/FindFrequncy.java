package Day12_4_23;

public class FindFrequncy {
	public void display(char[] arr) {
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

//		int arr[] = { 1, 4, 2, 5, 7, 3, 1, 1, 2 };

		char arr[] = { 'z', 'c', 'e', 'y', 'w', 'z', 'c', 'c' };

		FindFrequncy obj = new FindFrequncy();
		obj.display(arr);
	}

}

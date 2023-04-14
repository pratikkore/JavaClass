package Day11Array;

public class FindNumber {

	public void display(int arr[]) {

		int find = 300;
		int flag = 0;
		int i;
		for (i = 0; i < arr.length; i++) {
			if (arr[i] == find) {
				flag = 1;
				break;

			}
		}
		if (flag == 1) {
			System.out.println("Index number of given  number is : " + i);

		} else {
			System.out.println("not found ..");
		}

	}

	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 40, 50 };

		FindNumber obj = new FindNumber();
		obj.display(arr);
	}

}

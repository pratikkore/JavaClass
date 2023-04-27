package Day21ListDemo;

import java.util.ArrayList;

public class SortArray {

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<Integer>();

		arr.add(2);
		arr.add(1);
		arr.add(5);
		arr.add(3);
		arr.add(4);

		for (int i = 0; i < arr.size() - 1; i++) {
			for (int j = 0; j < arr.size() - 1 - i; j++) {
				if (arr.get(j) > arr.get(j + 1)) {
					int temp = arr.get(j);
					arr.set(j, arr.get(j + 1));
					arr.set(j + 1, temp);
				}
			}
		}

		System.out.println("Sorted ArrayList: " + arr);

	}
}

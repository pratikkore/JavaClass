package Day21ListDemo;

import java.util.ArrayList;

public class OddElement {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();

		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);

		for (int i : arr) {
			if (i % 2 == 1) {
				System.out.println(i + " is odd number..");
			}
		}
	}
}

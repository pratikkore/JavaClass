package Day21ListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class EvenPosition {

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<Integer>();

		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);

		Iterator<Integer> my_iterator = arr.iterator();

		int index = 0;
		while (my_iterator.hasNext()) {
			int element = my_iterator.next();
			if (index % 2 == 0) {
				System.out.println(element);
			}
			index++;
		}
	}
}

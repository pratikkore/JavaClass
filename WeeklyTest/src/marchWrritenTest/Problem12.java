package marchWrritenTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//12.	Write a code that shows Iterator is fail fast 

public class Problem12 {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		Iterator<Integer> iterator = numbers.iterator();

		while (iterator.hasNext()) {
			Integer number = iterator.next();
			System.out.println(number);
			if (number == 3) {
				numbers.add(6);
			}
		}
	}
}

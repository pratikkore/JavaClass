package Day26_4_23;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		ArrayList arrayList = new ArrayList();

		arrayList.add("Hello");
		arrayList.add(123);
		arrayList.add(3.14);
		arrayList.add(true);

		System.out.println("Displaying the ArrayList using for loop:");
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}

		System.out.println("\nDisplaying the ArrayList using for-each loop:");
		for (Object element : arrayList) {
			System.out.println(element);
		}

		System.out.println("\nDisplaying the ArrayList using Java 8 streams:");
		arrayList.stream().forEach(System.out::println);

		Iterator itr = arrayList.iterator();
		System.out.println("\nUseing Itertor while Loop : ");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	};
}

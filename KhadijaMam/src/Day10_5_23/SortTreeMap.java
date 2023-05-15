package Day10_5_23;

import java.util.HashMap;

public class SortTreeMap {

	public static void main(String[] args) {
		HashMap<Integer, String> m = new HashMap<>();

		m.put(1, "A");
		m.put(4, "B");
		m.put(2, "C");
		m.put(-4, "D");

		System.out.println("sorting by values");
		System.out.println(m);

	}

}

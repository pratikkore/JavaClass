package Day26Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {

		HashMap<String, Integer> ab = new HashMap();

		ab.put("Dhoni", 7);
		ab.put("virat", 18);
		ab.put("Sachin", 10);
		ab.put("Rohit", 45);
		ab.put("Gayle", 333);

		System.out.println(ab);

		System.out.println("*****************************************");

		for (Map.Entry<String, Integer> m : ab.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		System.out.println("*****************************************");

		Set s = ab.keySet();
		System.out.println(s);

		Iterator<String> it = s.iterator();

		while (it.hasNext()) {
//			 m = ;
			System.out.println(it.next());
		}

	}

}

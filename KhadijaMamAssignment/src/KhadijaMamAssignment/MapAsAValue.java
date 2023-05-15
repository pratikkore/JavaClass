package KhadijaMamAssignment;

import java.util.HashMap;
import java.util.Map;

//Create a Map which contain Integer as key and Another Map as Value
//another Map Contain Emp as Key and Integer as value Print the Map
//using Iterator.

class Emp {
	int id;
	String name;

	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}

}

public class MapAsAValue {

	public static void main(String[] args) {

		Map<Emp, Integer> hm = new HashMap<>();
		hm.put(new Emp(1, "xyz"), 101);
		hm.put(new Emp(2, "Pqr"), 202);
		hm.put(new Emp(3, "abc"), 303);

		Map<Emp, Integer> hm1 = new HashMap<>();
		hm.put(new Emp(202, "jk"), 3003);
		hm.put(new Emp(201, "pk"), 2002);
		hm.put(new Emp(203, "mk"), 1001);

		Map<Integer, Map<Emp, Integer>> hm2 = new HashMap<>();
		hm2.put(101, hm);
		hm2.put(202, hm1);

		for (Map.Entry<Integer, Map<Emp, Integer>> ab : hm2.entrySet()) {

			for (Map.Entry<Emp, Integer> bc : ab.getValue().entrySet()) {

				System.out.println(bc.getKey() + " " + bc.getValue());
			}
		}

	}

}

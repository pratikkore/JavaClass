package Day9_5_23;

import java.util.HashMap;
import java.util.Map;

public class Student1 {

	public static void main(String[] args) {

		HashMap<Integer, String> al = new HashMap<>();
		al.put(1, "Pratik");
		al.put(2, "xyz");
		al.put(3, "abc");
		al.put(4, "pqr");

		for (Map.Entry<Integer, String> m : al.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		System.out.println("**********************************************");
		System.out.println("Get Keys.....");

		for (Integer m2 : al.keySet()) {
			System.out.println(m2);
		}

		System.out.println("**********************************************");
		System.out.println("Get Values .....");

		for (String m2 : al.values()) {
			System.out.println(m2);
		}
	}

}

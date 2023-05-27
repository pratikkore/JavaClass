package Assignment_set_map_queue;

import java.util.ArrayList;
import java.util.Collections;

public class Problem3 {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("java");
		al.add("c");
		al.add("python");
		al.add("c++");
		System.out.println("before sorted ..");
		System.out.println(al + "\n");

		Collections.sort(al);
		System.out.println("After sorted ..");
		for (String m : al) {
			System.out.println(m);
		}
	}
}

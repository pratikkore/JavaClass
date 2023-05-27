package Assignment_set_map_queue;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Problem4 {

	public static void main(String[] args) {
		LinkedHashSet<Integer> hSet = new LinkedHashSet<Integer>();

		hSet.add(2);
		hSet.add(1);
		hSet.add(6);

		System.out.println(hSet);

		LinkedList<Integer> ls = new LinkedList<Integer>(hSet);
		Collections.reverse(ls);
		System.out.println("Reverse order array ...");
		for (Integer a : ls) {
			System.out.println(a);
		}
	}

}

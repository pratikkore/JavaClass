package Assignment_set_map_queue;

import java.util.TreeSet;

public class problem5 {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(2);
		ts.add(4);
		ts.add(3);
		ts.add(6);
		System.out.println("Orignal treeSet .");
		System.out.println(ts);

		System.out.println("First element in treeset - " + ts.pollFirst());
		System.out.println("First element in treeset - " + ts.pollLast());
	}

}

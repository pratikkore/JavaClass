package Assignment_set_map_queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Problem8 {

	public static void main(String[] args) {
		Queue<Integer> q = new PriorityQueue<>();
		q.add(1);
		q.add(2);
		q.add(5);
		q.add(3);
		q.add(4);
		q.add(7);
		System.out.println("Before remove....");
		System.out.println(q);
		q.poll();
		q.remove();

		System.out.println("after remove...");
		System.out.println(q);

	}

}

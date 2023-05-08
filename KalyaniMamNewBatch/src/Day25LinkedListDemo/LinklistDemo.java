package Day25LinkedListDemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class LinklistDemo {

	public static void main(String[] args) {

		LinkedList<Integer> li = new LinkedList<>();
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			li.add(sc.nextInt());
		}
		System.out.println(li);

		Iterator i = li.iterator();
		while (i.hasNext()) {
			int a = (int) i.next();
			if (a % 2 == 0) {
				i.remove();
			} else {
				System.out.println(a);
			}
		}
	}

}

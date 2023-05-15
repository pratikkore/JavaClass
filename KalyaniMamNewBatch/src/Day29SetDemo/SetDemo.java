package Day29SetDemo;

import java.util.Scanner;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {

		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(2);
		ts.add(4);
		ts.add(3);
		ts.add(6);
		ts.add(1);

		System.out.println(ts);

		TreeSet<Integer> ts1 = new TreeSet<>();
		ts1.add(7);
		ts1.add(4);
		ts1.add(9);
		ts1.add(6);
		ts1.add(3);

		System.out.println(ts1);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user Input : ");
		int s = sc.nextInt();

		if (ts.contains(s) && ts1.contains(s)) {
			System.out.println("Prsent in both set ...");
		} else {
			System.out.println("Not present ....");
		}

	}

}

package Test7;

import java.util.ArrayList;

//9.	Write a java program to remove duplicate elements from ArrayList.

public class Problem9 {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList();
		al.add(2);
		al.add(4);
		al.add(2);
		al.add(5);
		al.add(4);
		al.add(3);

		System.out.println("Before sorting ...");
		System.out.println(al);

		ArrayList<Integer> noDuplicate = new ArrayList();

		for (Integer i : al) {
			if (!noDuplicate.contains(i)) {

				noDuplicate.add(i);
			}
		}
		System.out.println(noDuplicate);

	}
}

package Test7;

import java.util.ArrayList;

//8.	Write a program to sort ArrayList by decending without using sort method and without converting into array.

public class Problem8 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList();
		al.add(2);
		al.add(4);
		al.add(1);
		al.add(5);
		al.add(3);

		System.out.println("Before sorting ...");
		System.out.println(al);

		for (int i = 0; i < al.size(); i++) {
			int temp = 0;
			for (int j = 0; j < al.size(); j++) {
				if (al.get(i) > al.get(j)) {
					temp = al.get(i);
					al.set(i, al.get(j));
					al.set(j, temp);
				}
			}
		}
		System.out.println("After sorting ...");

		System.out.println(al);
	}

}

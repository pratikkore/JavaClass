package Test7;

import java.util.ArrayList;
import java.util.Iterator;

//3.	Write a Java program to insert an element into the array list at the first position.

public class Problem3 {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("white");
		al.add("black");
		al.add("blue");
		al.add("silver");
		al.add("greay");

		al.add(0, "pink");

		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}

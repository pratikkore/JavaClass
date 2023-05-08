package Test7;

import java.util.ArrayList;
import java.util.Iterator;

//5.	Write a Java program to update specific array element by given element.

public class Problem5 {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("white");
		al.add("black");
		al.add("blue");
		al.add("silver");
		al.add("greay");

		al.set(0, "green");

		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}

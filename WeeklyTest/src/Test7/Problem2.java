package Test7;

import java.util.ArrayList;
import java.util.Iterator;

//2.	Write a Java program to iterate through all elements in an array list (Show all the ways).

public class Problem2 {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("white");
		al.add("black");
		al.add("blue");
		al.add("silver");
		al.add("greay");

		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

			System.out.println("*****************************");

			for (String i : al) {
				System.out.println(i);
			}

			System.out.println("********************************");

			for (int i = 0; i < al.size(); i++) {
				System.out.println(al.get(i));
			}

		}

	}

}

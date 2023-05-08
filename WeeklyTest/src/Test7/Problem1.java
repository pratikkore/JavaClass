package Test7;

import java.util.ArrayList;

//1.	Write a Java program to create a new array list, add some colours (string) and print out the collection

public class Problem1 {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();

		al.add("white");
		al.add("black");
		al.add("blue");
		al.add("silver");
		al.add("greay");

		for (String i : al) {
			System.out.println(i);
		}
	}

}

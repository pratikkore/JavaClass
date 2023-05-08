package Test7;

import java.util.ArrayList;

//4.	Write a Java program to retrieve an element (at a specified index) from a given array list. 

public class Problem4 {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("white");
		al.add("black");
		al.add("blue");
		al.add("silver");
		al.add("greay");

		System.out.println(al.get(3));
	}

}

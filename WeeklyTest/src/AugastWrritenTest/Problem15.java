package AugastWrritenTest;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Stack;

//15.	WAP to  Reverse a linked list using Stack

public class Problem15 {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		Collections.reverse(list);
		Stack<Integer> st = new Stack<Integer>();
		st.addAll(list);

		for (Integer i : st) {
			System.out.println(i);
		}
	}
}

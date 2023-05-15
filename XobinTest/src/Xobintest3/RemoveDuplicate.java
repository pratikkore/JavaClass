package Xobintest3;

import java.util.ArrayList;
import java.util.TreeSet;

public class RemoveDuplicate {

	public void duplicate(ArrayList<Integer> al, ArrayList<Integer> al2) {

		TreeSet<Integer> tr = new TreeSet<>();

//		for (Integer a : al) {
//			if (tr.contains(a) == false) {
//				tr.add(a);
//			}
//		}
//		for (Integer b : al2) {
//			if (tr.contains(b) == false) {
//				tr.add(b);
//			}
//		}

		tr.addAll(al);
		tr.addAll(al2);
		System.out.println(tr);
	}

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();

		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);

		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(6);
		al2.add(8);
		al2.add(3);
		al2.add(9);
		al2.add(5);

		RemoveDuplicate obj = new RemoveDuplicate();
		obj.duplicate(al, al2);

	}

}

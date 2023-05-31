package AugastWrritenTest;
//13)Given two LinkedList, 

//we need to combine two LinkedList  in such a way that the combined aList has alternate 
//elements of both. 
//If one list has extra element, then these elements are appended at the end of the combined list

import java.util.LinkedList;

public class Problem13 {

	private static final int LinkedList = 0;

	public static void main(String[] args) {

		LinkedList<Integer> list1 = new LinkedList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		list2.add(11);
		list2.add(22);
		list2.add(33);

		LinkedList<Integer> ls = new LinkedList<Integer>();
		int size1 = list1.size();
		int size2 = list2.size();

		int maxsize = Math.max(size1, size2);

		for (int i = 0; i < maxsize; i++) {
			if (i < size1) {
				ls.add(list1.get(i));
			}
			if (i < size2) {
				ls.add(list2.get(i));
			}
		}
		System.out.println(ls);
	}
}

package marchWrritenTest;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

//22. Consider there is already a TreeSet<Integer>created with elements.
//Write a function which will take input as a number or hardcode the number.
//If input number is present in Set then return the number which is present 2 locations 
//after the matching number.Eg set{14,15,63,78,96,100,112}.I/p 78 then return 100.
//If 100 is passed it will return null as there is no element 2 locations after it

public class Problem22 {

	public static void main(String[] args) {

		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(14);
		ts.add(15);
		ts.add(63);
		ts.add(78);
		ts.add(96);
		ts.add(100);
		ts.add(112);

		int input = 78;

		List<Integer> al = new ArrayList<Integer>(ts);
		int pos = al.indexOf(input);
//		System.out.println((pos + 2));
//		System.out.println(al.size());

		if ((pos + 2) <= al.size() - 1) {
			System.out.println(al.get(pos + 2));
		} else {
			System.out.println("null");
		}
	}
}

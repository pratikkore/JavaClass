package Test7;

import java.util.ArrayList;
import java.util.List;

//6.	WAP to convert ArrayList to array in 2 different ways and 
//array to ArrayList in 2 different ways (so total 4 ways)

public class Problem6 {

	public static void main(String[] args) {

		List<Integer> al = new ArrayList<Integer>();

		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);

		Object[] arr = al.toArray();
		for (Object obj : arr)

			System.out.print(obj + " ");
	}
}

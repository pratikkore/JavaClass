package Day20Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<Float> fl = new ArrayList<Float>();
		fl.add(23.43f);
		fl.add(32.56f);
		fl.add(12.43f);
		System.out.println("Befor Sort");
		System.out.println(fl);
		System.out.println("----------------------------------------------");
		Collections.reverse(fl);

		System.out.println("After Sort");
		System.out.println(fl);
	}

}

package Day24ListInArraylist;

import java.util.ArrayList;
import java.util.HashMap;

public class FindFrequncy {

	public static void main(String[] args) {

		ArrayList<Integer> aL = new ArrayList<Integer>();
		aL.add(2);
		aL.add(3);
		aL.add(2);
		aL.add(4);
		aL.add(3);
		aL.add(5);
		aL.add(3);
		aL.add(2);

		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int i = 0; i < aL.size(); i++) {
			if (hm.get(aL.get(i)) != null) {
				hm.put(aL.get(i), hm.get(aL.get(i)) + 1);

			} else {
				hm.put(aL.get(i), 1);
			}
		}
		System.out.print(hm);
	}
}

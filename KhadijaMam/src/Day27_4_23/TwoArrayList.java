package Day27_4_23;

import java.util.ArrayList;

public class TwoArrayList {

	public void display(ArrayList<String> str, ArrayList<String> str2) {
		str.addAll(str2);
//		System.out.println(str);
		ArrayList<String> str3 = new ArrayList<String>();

		for (int i = 0; i < str.size(); i++) {
			boolean isPresent = false;

			for (int j = 0; j < str.size(); j++) {

				if (str.get(i) == (str.get(j)) && i > j) {
					isPresent = true;
					break;
				}
			}
			if (!isPresent) {
				str3.add(str.get(i));
			}
		}
		System.out.println("\nUnique Element ArrayList : ");
		System.out.println(str3);
	}

	public static void main(String[] args) {
		ArrayList<String> str = new ArrayList<String>();

		str.add("mango");
		str.add("banana");
		str.add("watermelon");
		str.add("Kiwi");

		ArrayList<String> str2 = new ArrayList<String>();

		str2.add("mango");
		str2.add("pinaple");
		str2.add("watermelon");
		str2.add("greaps");

		TwoArrayList obj = new TwoArrayList();
		obj.display(str, str2);

	}

}

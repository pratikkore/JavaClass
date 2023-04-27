package Day27_4_23;

import java.util.ArrayList;

public class UniqueElement {
	public void display(ArrayList<String> str) {

		ArrayList<String> str2 = new ArrayList<String>();

		System.out.println("First Array List : ");
		System.out.println(str);

		for (int i = 0; i < str.size(); i++) {
			boolean isPresent = false;

			for (int j = 0; j < str.size(); j++) {

				if (str.get(i) == (str.get(j)) && i > j) {
					isPresent = true;
					break;
				}
			}
			if (!isPresent) {
				str2.add(str.get(i));
			}
		}
		System.out.println("\nUnique Element New ArrayList : ");
		System.out.println(str2);
	}

	public static void main(String[] args) {

		ArrayList<String> str = new ArrayList<String>();
		str.add("sun");
		str.add("mon");
		str.add("sun");
		str.add("tue");
		str.add("wed");
		str.add("mon");

		UniqueElement obj = new UniqueElement();
		obj.display(str);
	}

}

package Day27_4_23;

import java.util.ArrayList;

public class LengthRemove {

	public void display(ArrayList<String> str) {
		ArrayList<String> str2 = new ArrayList<String>();

		System.out.println("\nbelow ArrayList is Less than 7 Character..");
		for (int i = 0; i < str.size(); i++) {

			if (str.get(i).length() <= 7) {
				str2.add(str.get(i));
			}
		}
		System.out.println(str2);
	}

	public static void main(String[] args) {

		ArrayList<String> str = new ArrayList<String>();

		str.add("wednesday");
		str.add("tuesday");
		str.add("monday");
		str.add("saturday");
		str.add("friday");
		str.add("thursday");
		str.add("sunday");

		LengthRemove obj = new LengthRemove();
		obj.display(str);
	}

}

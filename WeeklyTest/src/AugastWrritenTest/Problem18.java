package AugastWrritenTest;

//18.	WAP to accept a string and make following changes [1M]

//•	Shift each letter right by two step eg A ->C ,Y->A,Z->B
//•	Each digit by next higher digit.
//•	Space by underscore

public class Problem18 {

	public static void main(String[] args) {

		String str = "ayz";
		String t = "";

		for (int i = 0; i < str.length(); i++) {
			char c = (char) (str.charAt(i) + 2);
			if (c >= 'a' && c <= 'z') {
				t = t + c;
			} else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {

				t = t + (char) (str.charAt(i) - 24);
			} else if (str.charAt(i) == ' ') {
				t = t + "_";
			} else {
				t = t + str.charAt(i);
			}
		}
		System.out.println(t);
	}
}
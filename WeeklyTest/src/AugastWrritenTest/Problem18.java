package AugastWrritenTest;

//18.	WAP to accept a string and make following changes [1M]

//•	Shift each letter right by two step eg A ->C ,Y->A,Z->B
//•	Each digit by next higher digit.
//•	Space by underscore

public class Problem18 {

	public static void main(String[] args) {

		String str = "ayz";
		String temp = "";
		for (int i = 0; i < str.length(); i++) {
			Char c = (char) (str.charAt(i) + 2);

		}
		System.out.println(temp);
	}

}

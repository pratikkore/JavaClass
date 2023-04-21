package Day15String;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {

		String str1 = "hello";
		String str2 = "hello";

		if (str1.length() == str2.length()) {
			String s1 = str1.toLowerCase();
			String s2 = str2.toLowerCase();

			char[] ch1 = s1.toCharArray();
			char[] ch2 = s2.toCharArray();

			Arrays.sort(ch1);
			Arrays.sort(ch2);

			String toStr1 = new String(ch1);
			String toStr2 = new String(ch2);

			if (toStr1.equals(toStr2)) {
				System.out.println("This is Anagram String..");
			}
		} else {
			System.out.println("This is not Anagram String .");
		}

	}

}

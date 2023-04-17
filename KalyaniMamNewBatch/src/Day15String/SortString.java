package Day15String;

import java.util.Arrays;

public class SortString {

	public static void main(String[] args) {
		String str = "aaa i like codeing a ab";

		String[] sp = str.split(" ");

		for (int i = 0; i < sp.length; i++) {
			for (int j = i + 1; j < sp.length; j++) {
				if (sp[i].compareTo(sp[j]) > 0) {
					String temp = sp[i];
					sp[i] = sp[j];
					sp[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(sp));
	}

}

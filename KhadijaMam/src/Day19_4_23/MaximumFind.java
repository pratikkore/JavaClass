package Day19_4_23;

import java.util.Arrays;

public class MaximumFind {

	public void find(String str) {

		String[] sp = str.split(" ");
		String largeWord = sp[0];

		System.out.println(Arrays.toString(sp));

		for (int i = 1; i < sp.length; i++) {
			if (sp[i].length() > largeWord.length()) {

//					String temp = sp[i];
//					sp[i] = sp[j];
//					sp[j] = temp;
				largeWord = sp[i];
			}
		}
		System.out.println(largeWord);
	}

	public static void main(String[] args) {

		String str = "India is Beautiful Country";

		MaximumFind obj = new MaximumFind();

		obj.find(str);
	}
}

package Day19_4_23;

import java.util.Arrays;

public class ReverseString {

	public void display(String str) {

		String[] arr = str.split(" ");
		for (int i = 0; i < arr.length; i++) {
//			for (int j = arr[i].length() - 1; j >= 0; j--) {
//
//				System.out.print(arr[i].charAt(j));
//			}

			String temp = arr[i];

			char[] ch = temp.toCharArray();
			for (int j = 0, k = ch.length - 1; j < ch.length / 2; j++, k--) {
				char chTemp = ch[j];
				ch[j] = ch[k];
				ch[k] = chTemp;
			}
			System.out.print(Arrays.toString(ch));
		}

	}

	public static void main(String[] args) {

		String str = "hello java";

		ReverseString obj = new ReverseString();
		obj.display(str);
	}

}

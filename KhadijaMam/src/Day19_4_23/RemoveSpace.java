package Day19_4_23;

import java.util.Arrays;

public class RemoveSpace {

	public void display(String str) {

		String[] arr = str.split(" ");
		String s1 = "";
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].trim() != "") {
				s1 = s1 + arr[i].trim() + " ";
			}

		}
		System.out.println(s1.trim());
	}

	public static void main(String[] args) {
		String str = "i love  my   india";

		RemoveSpace obj = new RemoveSpace();
		obj.display(str);
	}

}

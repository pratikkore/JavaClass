package Day19_4_23;

public class UppercaseString {

	public void display(String str) {

		String[] arr = str.toLowerCase().split(" ");
		char s = 0;
		String crrString = "";

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length(); j++) {

				s = arr[i].charAt(j);
				char t1 = (char) (s - 32);
				crrString = crrString + t1;
			}
			crrString = crrString + " ";
		}
		System.out.println(crrString);
	}

	public static void main(String[] args) {

		String str = "india is my coutry";

		UppercaseString obj = new UppercaseString();

		obj.display(str);

	}

}

package Day19_4_23;

public class FirstLetterUpperCase {

	public void display(String str) {

		String[] arr = str.toLowerCase().split(" ");
		char s = 0;
		String crrString = "";

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length(); j++) {
				if (j == 0) {
					s = arr[i].charAt(0);

					char t1 = (char) (s - 32);

					crrString = crrString + t1;

				} else {
					crrString = crrString + arr[i].charAt(j);

				}
			}
			crrString = crrString + " ";
		}
		System.out.println(crrString);
	}

	public static void main(String[] args) {

		String str = "india is my coutry";

		FirstLetterUpperCase obj = new FirstLetterUpperCase();

		obj.display(str);

	}

}

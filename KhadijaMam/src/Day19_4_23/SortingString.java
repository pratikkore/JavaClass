package Day19_4_23;

public class SortingString {

	public void display(String str) {

		String[] sp = str.split(" ");

		String sortedString = "";
		for (int i = 0; i < sp.length; i++) {
			for (int j = i + 1; j < sp.length; j++) {
				if (sp[i].compareTo(sp[j]) > 0) {
					String temp = sp[i];
					sp[i] = sp[j];
					sp[j] = temp;
				}
			}
		}

		for (int i = 0; i < sp.length; i++) {
			sortedString = sortedString + " " + sp[i];
		}
		System.out.println(sortedString);

	}

	public static void main(String[] args) {

		String str = "pune mumbai delhi banglore";

		SortingString obj = new SortingString();

		obj.display(str);
	}

}

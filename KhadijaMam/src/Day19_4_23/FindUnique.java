package Day19_4_23;

public class FindUnique {

	public void display(String str) {
		for (int i = 0; i < str.length(); i++) {
			boolean isPresent = false;
			for (int j = 0; j < str.length(); j++) {
				char ch = str.charAt(i);
				char chJ = str.charAt(j);

				if ((ch == chJ) && i > j) {
					isPresent = true;
					break;
				}
			}
			if (!isPresent)
				System.out.print(str.charAt(i));
		}
	}

	public static void main(String[] args) {

		String str = "abcdcbd";

		FindUnique obj = new FindUnique();

		obj.display(str);
	}

}

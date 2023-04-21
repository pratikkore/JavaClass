package Day19_4_23;

public class SecondOccurance {

	public void display(String str) {

		char user = 'a';
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			char a = str.charAt(i);

			if (a == user && count < 2) {
				count++;
				if (count == 2) {
					System.out.println("Second occurance found at index - " + i);
					break;
				}
			}
		}
	}

	public static void main(String[] args) {

		String str = "accbashdgysewveasvdbsvdhg";

		SecondOccurance obj = new SecondOccurance();

		obj.display(str);

	}

}

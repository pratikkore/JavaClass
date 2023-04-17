package Day15String;

public class PatternString {

	public static void main(String[] args) {

		String str = "what is your name";

		String[] sp = str.split(" ");

		for (int i = 0; i < sp.length; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(sp[j] + " ");
			}
			System.out.println();
		}
	}
}

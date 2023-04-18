package Day15String;

public class findSumEvenString {

	public static void main(String[] args) {

		String str = "eu2yrewu2olnir8wd86da446";
		int sum = 0;
		int evenNumber = 0;
		for (int i = 0; i < str.length(); i++) {

			int ch = str.charAt(i);

			if (ch >= '0' && ch <= '9') {
				if (ch % 2 == 0) {
					evenNumber = ch;
					sum = sum + Character.getNumericValue(ch);
				}
			}
		}
		System.out.println(sum);
	}

}

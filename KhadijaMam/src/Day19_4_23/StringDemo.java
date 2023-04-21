package Day19_4_23;

public class StringDemo {

	public void spaceCount(String str) {

		int count = 0;

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (ch == ' ') {
				count++;
			}
		}
		System.out.println("Space count  in String is= " + count);
		System.out.println("*******************************************");
	}

	public void vowelsCount(String str) {
		int vowelscount = 0;
		int consonantCount = 0;

		String lower = str.toLowerCase();

//		System.out.println("Vowels ");

		for (int i = 0; i < lower.length(); i++) {

			char ch = lower.charAt(i);
			if (ch >= 'a' && ch <= 'z') {

				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//				System.out.println("Vowels Present in this string is = ");
					System.out.println(ch);
					vowelscount++;
				} else {
					consonantCount++;
				}
			}
		}
		System.out.println("vowels count in this String is = " + vowelscount);
		System.out.println("consonant count is = " + consonantCount);

		System.out.println("***********************************************");
	}

	public void specialChar(String str) {
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch == '@' || ch == '$' || ch == '&' || ch == '#' || ch == '.') {
				System.out.println(ch);
				count++;
			}
		}
		System.out.println("Special character count is = " + count);

	}

	public static void main(String[] args) {

		String str = "Pratik@1 2 3";

		StringDemo obj = new StringDemo();

		obj.spaceCount(str);
		obj.vowelsCount(str);
		obj.specialChar(str);
	}
}

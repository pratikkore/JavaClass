package Day19_4_23;

public class FrequncyFind {

	public void display(String str) {
		for (int i = 0; i < str.length(); i++) {
			int count = 0;
			boolean isPresent = false;
			for (int j = 0; j < str.length(); j++) {
				char ch = str.charAt(i);
				char chJ = str.charAt(j);

				if ((ch == chJ) && i > j) {
					isPresent = true;
					break;
				}
				if (ch == chJ) {
					count++;
				}
			}
			if (!isPresent)
				System.out.println(str.charAt(i) + " frequncy is " + count);
		}
//		System.out.println(count);
	}

	public static void main(String[] args) {
		String str = "accbashdgysewveasvdbsvdhg";

		FrequncyFind obj = new FrequncyFind();

		obj.display(str);
	}

}

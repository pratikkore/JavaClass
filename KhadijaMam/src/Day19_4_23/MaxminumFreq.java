package Day19_4_23;

public class MaxminumFreq {

	public void display(String str) {
		int maxCount = 0;
		char maxChar = 0;

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
			if (count > maxCount && !isPresent) {
				maxCount = count;
				maxChar = str.charAt(i);

			}

		}
		System.out.println(maxChar + " Maximum Count is : " + maxCount);
	}

	public static void main(String[] args) {
		String str = "java javaprogram";

		MaxminumFreq obj = new MaxminumFreq();

		obj.display(str);
	}

}

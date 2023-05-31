package marchWrritenTest;

//4.	Reverse a string preserving space positions 
//] Input : "Help others"

public class Problem4 {

	public static void main(String[] args) {

		String input = "Help others";
		char[] characters = input.toCharArray();
		int length = characters.length;
		int start = length - 1;
		int end = length - 1;

		while (start >= 0) {
			if (characters[start] != ' ') {
				char temp = characters[start];
				characters[start] = characters[end];
				characters[end] = temp;
				end--;
			}
			start--;
		}

		String reversedString = new String(characters);
		System.out.println(reversedString);
	}

}

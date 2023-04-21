package Day15String;

import java.util.Scanner;

public class RemoveVowels {

	public static void main(String[] args) {

//		String str = "abcdefghijklmnopqrstuvwxyz";

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String ...");
		String str = sc.next();

		String low = str.toLowerCase();

		for (int i = 0; i < low.length(); i++) {

			char currentChar = low.charAt(i);
			if (currentChar != 'a' && currentChar != 'e' && currentChar != 'i' && currentChar != 'o'
					&& currentChar != 'u') {
				System.out.print(currentChar);
			}
		}
	}

}

package BasicJava;

import java.util.Scanner;

public class ConvertCamelToLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char letter;

		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter User Input :");
		letter = userInput.next().charAt(0);

		if (letter >= 'A' && letter <= 'Z') {
			System.out.println((char) (letter + 32));
		} else if (letter >= 'a' && letter <= 'z') {
			System.out.println((char) (letter - 32));
		}
	}

}

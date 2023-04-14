package AssignmentSwitchCase;

import java.util.Scanner;

public class StringType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String game;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String : ");
		game = sc.next();
		game = game.toLowerCase();

		switch (game) {
		case "hockey":
			System.out.println("Let's play Hockey");
			break;
		case "cricket":
			System.out.println("Let's play Cricket");
			break;
		case "football":
			System.out.println("Let's play Football");
		}

	}

}

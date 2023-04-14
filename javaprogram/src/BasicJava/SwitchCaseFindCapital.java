package BasicJava;

import java.util.Scanner;

public class SwitchCaseFindCapital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter State Name : ");
		String user = sc.next();
		user = user.toLowerCase();

		switch (user) {
		case "maharashtra":
			System.out.println("capital of maharashtra is Mumbai");
			break;

		case "karnataka":
			System.out.println("capital of Karnataka is banglore");
			break;

		case "gujrat":
			System.out.println("capital of Gujrat is GandhiNagar");
			break;

		case "goa":
			System.out.println("capital of Goa is Panji");
			break;

		case "bihar":
			System.out.println("capital of Bihar is Patana");
			break;

		default:
			System.out.println("Please Enter Valid State :  ");

		}
	}

}

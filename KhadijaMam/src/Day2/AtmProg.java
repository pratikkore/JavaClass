package Day2;

import java.util.Scanner;

public class AtmProg {
	int password = 12345, userPass;
	int balance = 3000, minBalnce = 500;
	String name;
	int action;

	public void inputUserData() {
		int count = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User Name : ");
		name = sc.next();

		while (count <= 3) {
			System.out.println("Enter user Password : ");
			userPass = sc.nextInt();

			if (password == userPass) {
				System.out.println("Hello " + name + "  Welcome to our Bank.....");
				userAction();
			} else {
				System.out.println("Wrong credentials...try again");
				System.out.println("Try Another Password Please .You have " + (3 - count) + " more chance");
				count++;
				if (count > 3) {
					System.out.println("your excceds limit please Visit nearest branch..");
				}
			}
		}
	}

	public void userAction() {
		do {
			Scanner sc = new Scanner(System.in);
			System.out.print("1.Withdraw 2.deposit 3.Check Balnce 4.Exit ");
			action = sc.nextInt();
			userService();

			System.out.println("\n Do You want to continue ..y/n");
			char yesNo = sc.next().charAt(0);

			if (yesNo == 'y') {
				userAction();
			}

		} while (action != 4);

	}

	public void userService() {
		switch (action) {
		case 1:
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter withraw amount : ");
			int withdraw = sc.nextInt();
			if (minBalnce < balance) {
				System.out.print("Collect your cash....." + "\nCurrent Balnce is " + (balance - withdraw));
			} else {
				System.out.println("Insuffucent Balance ..");
			}
			break;

		case 2:
			Scanner ab = new Scanner(System.in);
			System.out.println("Enter  amount : ");
			int deposite = ab.nextInt();
			if (deposite > 0) {
				System.out.println("Your succefully deposited your Amount Current balnce is : " + (balance + deposite));
			} else {
				System.out.println("Please deposite valid amount...");
			}
			break;

		case 3:
			System.out.println("Your current Balance is : " + balance);
			break;

		case 4:
			System.out.println("Your log out your session ....");
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AtmProg obj = new AtmProg();
		obj.inputUserData();
	}

}

package Day19_4_23;

import java.util.Scanner;

public class PasswordValidation {

	public void display(String strName) {

		String storeUser = "pratik@123";

		if (storeUser.equals(strName)) {
			System.out.println("Login succefull..");
		} else {
			System.out.println("Wrong USer Name");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User Name : ");
		String strUser = sc.next();

		PasswordValidation obj = new PasswordValidation();
		obj.display(strUser);

	}

}

package BasicJava;

import java.util.Scanner;

public class Greading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float marks;

		Scanner GreadingOnMarkScanner = new Scanner(System.in);
		System.out.println("Enter student marks :");
		marks = GreadingOnMarkScanner.nextFloat();

		if (marks >= 90) {
			System.out.println("Student Grade : A ");
		} else if (marks >= 70) {
			System.out.println("Student Grade : B ");
		} else if (marks > 40) {
			System.out.println("Student Grade : c ");
		} else {
			System.out.println("this student is fail in exam  ");
		}
	}

}

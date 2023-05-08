package May6;

import java.util.Scanner;

public class DeletString {

	public void delet(String s1, String s2) {
		for (int i = 0; i < s2.length(); i++) {
			s1 = s1.replace(s2.charAt(i) + "", "");
		}
		System.out.println(s1);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter firrst String ..");
		String s1 = sc.next();

		System.out.println("Enter Second String ..");
		String s2 = sc.next();

		DeletString d = new DeletString();
		d.delet(s1, s2);

	}

}

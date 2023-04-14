//8.Write a program to count number of digits in any number

package AssigmentOnLooping;

import java.util.Scanner;

public class CountDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int user, count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your Input - ");
		user = sc.nextInt();

		String s = String.valueOf(user);
		for (int i = 0; i <= s.length(); i++) {
			count = i + count;
			System.out.println(count);
		}
	}

}
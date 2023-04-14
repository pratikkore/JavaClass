//12.	WAP to print table of given no

package AssigmentOnLooping;

import java.util.Scanner;

public class TableOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User Number =");
		int num = sc.nextInt();
		int table;

		for (int i = 1; i <= 10; i++) {
			table = i * num;
			System.out.println(table);
		}
	}

}

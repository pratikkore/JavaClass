package Test6;

//find facinating number 

import java.util.Scanner;

public class Problem15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a 3-digit number: ");
		int num = input.nextInt();
		if (num < 100 || num > 999) {
			System.out.println("Error: Not a 3-digit number!");
			return;
		}
		String concatNums = Integer.toString(num) + Integer.toString(num * 2) + Integer.toString(num * 3);
		for (int i = 1; i <= 9; i++) {
			if (!concatNums.contains(Integer.toString(i))) {
				System.out.println(num + " is not a fascinating number!");
				return;
			}
		}
		System.out.println(num + " is a fascinating number!");
	}

}

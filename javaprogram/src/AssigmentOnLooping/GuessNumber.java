////18.	write a program that takes a number as input from user. The key number is 4 and 
//the user enters single digit numbers. Ask the user for a number till he gets the correct answer. 
//Then display the number of tries it took to guess the correct number.

package AssigmentOnLooping;

import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Single Digit Number -");
		int ab = sc.nextInt();
		int key = 4;
		int guess = 1;
		if (ab < 10) {
			while (key != ab) {
				guess++;
				System.out.println("Try Again : ");
				ab = sc.nextInt();
			}
			System.out.println("-------------------------------------");
			System.out.println("You get YOur Dessire number of guesses: " + guess);
		} else {
			System.out.println("Try Again with Different single digit Number: ");
//			ab = sc.nextInt();
		}

	}
}

//6.	 Write a program to find sum of all even numbers between 1 to n. 

package AssigmentOnLooping;

import java.util.Scanner;

public class AdditionOfEvenNumb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number -");
		int num = sc.nextInt();
		int m = 0;
		while (num != 0) {

			int r = num % 10;
			if (r / 2 == 0) {
				m = m * r;
			}
			num = num / 10;
		}
		System.out.println(m);
	}

}

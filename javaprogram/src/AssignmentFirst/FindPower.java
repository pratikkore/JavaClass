//10. Write a Java program to find power of any number x ^ y.

package AssignmentFirst;

import java.util.Scanner;

public class FindPower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int base, exponent;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your base Number : ");
		base = sc.nextInt();
		System.out.println("Enter Your exponent Number : ");
		exponent = sc.nextInt();

		System.out.println("Power of this number : " + (base * exponent));

	}

}

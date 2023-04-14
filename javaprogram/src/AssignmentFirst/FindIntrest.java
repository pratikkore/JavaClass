//16. Write a Java program to enter P, T, R and calculate Simple Interest.

package AssignmentFirst;

import java.util.Scanner;

public class FindIntrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float initial, anuualRate, time;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter initial Prinipal balance : ");
		initial = sc.nextFloat();
		System.out.println("Enter annual rate in % : ");
		anuualRate = sc.nextFloat();
		System.out.println("Enter time in Years  : ");
		time = sc.nextFloat();

		double simpleIntrest = ((initial * anuualRate * time) / 100);

		System.out.println("Intrest rate is : " + simpleIntrest);

	}

}

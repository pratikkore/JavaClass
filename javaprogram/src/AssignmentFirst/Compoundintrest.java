//17. Write a Java program to enter P, T, R and calculate Compound Interest.

package AssignmentFirst;

import java.util.Scanner;

public class Compoundintrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//A	=	final amount
//P	=	initial principal balance
//r	=	interest rate
//n	=	number of times interest applied per time period
//t	=	number of time periods elapsed

		float p, r, n, t;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter initial principal balance : ");
		p = sc.nextFloat();
		System.out.println("Enter interest rate % : ");
		r = sc.nextFloat();
		System.out.println("Enter number of times interest applied per time period  : ");
		n = sc.nextFloat();

		float A = p * ((1 + r / 100) * (1 + (r / 100)) * (1 + r / 100));

		float ci = A - p;

		System.out.println("Compound intrest is : " + ci);

	}

}

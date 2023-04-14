package Test2;

import java.util.Scanner;

public class Problem10 {

//	Write a program to find twin prime number. (Accept two no from
//    user and check, if both are prime and their difference is 2 then they
//	are twin prime). 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b, c1 = 0, c2 = 0, d;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a : ");
		a = sc.nextInt();

		System.out.println("Ennter b : ");
		b = sc.nextInt();

		for (int i = 1; i < a; i++) {
			if (a % i == 0)
				c1++;

		}
		for (int i = 2; i < b; i++) {
			if (b % i == 0)
				c2++;

			d = Math.abs(a - b);

			if (d == 2 && c1 == 2 && c2 == 2) {
				System.out.println("Twin prime");
			} else {
				System.out.println("not twin prime");
			}
		}
	}

}

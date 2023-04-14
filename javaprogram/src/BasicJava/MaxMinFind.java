package BasicJava;

import java.util.Scanner;

public class MaxMinFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter numb");

		int num = sc.nextInt();
		int max = num % 10;
		int min = num % 10;

		while (num != 0) {
			int r = num % 10;

			if (r > max) {
				max = r;
			}

			if (r < min) {
				min = r;
			}
			num = num / 10;
		}
		System.out.println(max);
		System.out.println(min);
	}

}

package AssigmentOnLooping;

import java.util.Scanner;

public class SumOfAllOddNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :");
		int n = sc.nextInt();
		int a = 0;

		for (int i = 1; i <= n; i += 2) {
			if (i % 2 == 1) {
				a += i;
			}

		}
		System.out.println("Total Sum Of Odd Number is =" + a);
	}

}

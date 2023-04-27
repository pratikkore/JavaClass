package Day22;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumber {

	public void prime(ArrayList<Integer> num) {
		System.out.println("This are Prime Numbers : ");
		for (int i = 0; i < num.size(); i++) {
			int count = 0;

			for (int j = 1; j <= num.get(i); j++) {
				if (num.get(i) % j == 0) {
					count++;
				}
			}
			if (count == 2 || num.get(i) == 1) {
				System.out.println(num.get(i));
			}
		}
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ArrayList<Integer> num = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter How many numbers you want to add : ");
		int nSize = sc.nextInt();

		for (int i = 0; i < nSize; i++) {
			System.out.println("Enter User Inputs  : ");
			int user = sc.nextInt();
			num.add(user);
		}

//		num.add(3);
//		num.add(4);
//		num.add(5);
//		num.add(7);
//		num.add(8);

		PrimeNumber p = new PrimeNumber();
		p.prime(num);

	}
}

package Day22;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class DivisableByThree {
	public void display(ArrayList<Integer> num) {

		System.out.println("\nBelow numbers are divisable by three : ");

		for (int i = 0; i < num.size(); i++) {

			if (num.get(i) % 3 == 0) {
				System.out.println(num.get(i));
			}
		}
	}

	public void remove(ArrayList<Integer> num) {

		System.out.println("\nBelow numbers are not divisible by 3 : ");

		Iterator a = num.iterator();
		while (a.hasNext()) {
			int i = (int) a.next();

			if (i % 3 == 0) {
				a.remove();
			}
		}
		System.out.println(num);
	}

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
		DivisableByThree p = new DivisableByThree();
		p.display(num);
		p.remove(num);
	}
}

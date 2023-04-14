//18.	WAP to check given no is automorphic or not

package AssigmentOnLooping;

import java.util.Scanner;

public class FindAutomorphic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number -");
		int num = sc.nextInt();
		int count = 0;
		int square = num * num;

		int temp = num;
		while (temp > 0) {
			count++;
			temp = temp / 10;
		}
		int lastDigit = (int) (square % (Math.pow(10, count)));
		if (num == lastDigit) {
			System.out.println("this is automorphic number ");
		} else {
			System.out.println("this is not a automorphic number ");
		}
	}

}

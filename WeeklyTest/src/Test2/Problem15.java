package Test2;

import java.util.Scanner;

public class Problem15 {

//	1!+2!+3!+4!...n WAP java program to find sum

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User Number =");
		int num = sc.nextInt();
		int ans = 1;
		for (int i = 1; i <= num; i++) {
			ans = ans + i;
		}
		System.out.println(ans);
	}

}

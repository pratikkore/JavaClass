//15.	 1!+2!+3!.........+n! find s

package AssigmentOnLooping;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User Number =");
		int num = sc.nextInt();
		int ans = 1;
		for (int i = 1; i <= num; i++) {
			ans = ans * i;
		}
		System.out.println(ans);
	}

}

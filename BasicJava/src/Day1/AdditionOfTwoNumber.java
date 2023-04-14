package Day1;
import java.util.Scanner;

public class AdditionOfTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your First String");
		int first = sc.nextInt();

		System.out.println("Enter Your Second String");
		int second = sc.nextInt();

		int c = first + second;
		int d = first * second;
		int e = first - second;
		int f = first / second;

		System.out.println("addition of these two number are : " + c);
		System.out.println("multiplication of these two number are : " + d);
		System.out.println("Substraction of these two number are : " + e);
		System.out.println("division of these two number are : " + f);

	}

}

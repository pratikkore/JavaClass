package Day1;
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your First String");
		String first = sc.next();

		System.out.println("Enter Your Second String");
		String second = sc.next();

		System.out.println(first + " " + second);
	}

}

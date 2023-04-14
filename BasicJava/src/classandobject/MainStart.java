package classandobject;

import java.util.Scanner;

public class MainStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patterns obj = new Patterns();
		Scanner sc = new Scanner(System.in);

		System.out.println("enter user value =");
		int r = sc.nextInt();
		System.out.println("1.Star Pattern =");
		System.out.println("2.number Pattern =");
		System.out.println("3.Reverse Star Pattern =");
		System.out.println("4.Binary Pattern =");
		System.out.println("5.Fiboonaci Pattern =");
		int key = sc.nextInt();

		switch (key) {
		case 1:

			obj.starPattern(r);
			break;

		case 2:

			obj.numberPattern(r);
			break;

		case 3:

			obj.reversestarPattern(r);
			break;

		case 4:
			obj.binaryPattern(r);

		case 5:
			obj.fibbinociPattern(r);
		}
	}

}

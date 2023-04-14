package Day1;

import java.util.Scanner;

public class FindAreaOfRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int width, length;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your length :");
		width = sc.nextInt();
		System.out.println("Enter your width :");
		length = sc.nextInt();

		System.out.println(" rectangle area is :" + width * length);
	}

}

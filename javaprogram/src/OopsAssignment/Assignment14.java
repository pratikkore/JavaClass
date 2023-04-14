package OopsAssignment;

import java.util.Scanner;

public class Assignment14 {
	int width, length;

	public void display(int w, int l) {
		width = w;
		length = l;
		System.out.println("Area of Rectangle is : " + (width * length));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment14 rec = new Assignment14();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your width :");
		int width = sc.nextInt();
		System.out.println("Enter your length :");
		int length = sc.nextInt();

		rec.display(width, length);
	}

}

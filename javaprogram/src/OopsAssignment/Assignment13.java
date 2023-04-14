package OopsAssignment;

import java.util.Scanner;

public class Assignment13 {
	int length, width, height;

	public void volume(int l, int w, int h) {
		length = l;
		width = w;
		height = h;
	}

	public void displayVolume() {
		System.out.println("Total volume of = " + (length * width * height));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Assignment13 vol = new Assignment13();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length,width,height....");
		int len = sc.nextInt();
		int wid = sc.nextInt();
		int hei = sc.nextInt();

		vol.volume(len, wid, hei);
		vol.displayVolume();

	}

}

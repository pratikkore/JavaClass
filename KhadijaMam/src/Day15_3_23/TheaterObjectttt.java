package Day15_3_23;

import java.util.Arrays;
import java.util.Scanner;

class Theaterr {
	String name;
	String location;
	int screen[];

	public Theaterr(String n, String l, int screen[]) {
		this.name = n;
		this.location = l;
		this.screen = screen;
//		System.out.println("This is first Screen");
	}

	@Override
	public String toString() {
		return name + " " + location + " " + screen;

	}
}

public class TheaterObjectttt {

	public static void main(String[] args) {

		Theaterr the[] = new Theaterr[3];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < the.length; i++) {

			System.out.println("Enter Thetar Name : ");
			String mName = sc.next();

			System.out.println("Enter Theater Location :");
			String mLocation = sc.next();

			System.out.println("Enter Screen Number :");
			int size = sc.nextInt();

			int screen[] = new int[size];

			for (int j = 0; j < screen.length; j++) {
				screen[j] = sc.nextInt();
			}

			the[i] = new Theaterr(mName, mLocation, screen);
		}
//		System.out.println(Arrays.toString(the));

		for (Theaterr t : the) {
			System.out.print("\n Theater Name :" + t.name + " " + "\n Theater Location : " + t.location + " "
					+ "\n Number of Screen : " + Arrays.toString(t.screen));
		}
	}

}

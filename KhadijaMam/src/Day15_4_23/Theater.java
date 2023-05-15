package Day15_4_23;

import java.util.Scanner;

class Movies {
	String mName;
	float rating;
	Movies m1;

	public Movies(String mName, float rating) {
		this.mName = mName;
		this.rating = rating;

	}

	@Override
	public String toString() {
		return mName + " " + rating;
	}
}

public class Theater {
	int tId;
	String tName;
	Movies m;

	public Theater(int tId, String tName, Movies m) {
		this.tId = tId;
		this.tName = tName;
		this.m = m;
	}

	public static void main(String[] args) {
		Theater obj = new Theater(1, "pvr", new Movies("pk", 3.5f));

		Theater obj2[] = new Theater[2];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < obj2.length; i++) {
			System.out.println("Enter Theater Id : ");
			int id = sc.nextInt();

			System.out.println("Enter theater name : ");
			String name = sc.next();

			System.out.println("Enter movies name : ");
			String movieName = sc.next();

			System.out.println("Enter movie ratings : ");
			float rating = sc.nextFloat();
		}
		System.out.println(obj.tId);
		System.out.println(obj.tName);

		System.out.println(obj.m.mName);
		System.out.println(obj.m.rating);
	}
}

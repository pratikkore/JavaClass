package Day1;

import java.util.Scanner;

public class FindAreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float radius;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your radius :");
		radius = sc.nextFloat();

		System.out.println("area of circle is :" + 3.14f * radius * radius);

	}

}

package OopsAssignment;

import java.util.Scanner;

//15)create student class assign marks and calculate the percentage and print the result 1st class,2nd class etc.

public class Assignment15 {
	int sub1, sub2, sub3;
	float percentage = 0;

	public void getMarks(int s1, int s2, int s3) {
		sub1 = s1;
		sub2 = s2;
		sub3 = s3;
	}

	public void calculate() {
		percentage = (float) ((sub1 + sub2 + sub3) * 0.3333);
		System.out.println(percentage);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Assignment15 obj = new Assignment15();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first subject marks: ");
		int subj1 = sc.nextInt();
		System.out.println("Enter second subject marks: ");
		int subj2 = sc.nextInt();
		System.out.println("Enter third subject marks: ");
		int subj3 = sc.nextInt();

		obj.getMarks(subj1, subj2, subj3);
		obj.calculate();

	}

}

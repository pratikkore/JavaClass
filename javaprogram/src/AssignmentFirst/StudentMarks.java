//15. Write a Java program to enter marks of five subjects and calculate total, average and percentage.

package AssignmentFirst;

import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float sub1, sub2, sub3, sub4, sub5, total;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks of 1st Subject : ");
		sub1 = sc.nextFloat();

		System.out.println("Enter Marks of 2nd Subject : ");
		sub2 = sc.nextFloat();

		System.out.println("Enter Marks of 3rd Subject : ");
		sub3 = sc.nextFloat();

		System.out.println("Enter Marks of 4th Subject : ");
		sub4 = sc.nextFloat();

		System.out.println("Enter Marks of 5th Subject : ");
		sub5 = sc.nextFloat();

		total = sub1 + sub2 + sub3 + sub4 + sub5;

		System.out.println("Total marks of student :" + total);
		System.out.println("Average marks of student : " + total / 5);
		System.out.println("percentage of student is :" + ((total) / 500) * 100);

	}

}

package OopsAssignment;

import java.util.Scanner;

public class Assignment11 {

//	11. From scanner In loop (for 2 iterations) read Student
//	data create new object each time assign values and print
//	student values in console.
	int studId;
	String studName;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 2; i++) {

			Assignment11 s1 = new Assignment11();
			s1.studId = i;

			System.out.println("Enter name of student  -" + i);

			s1.studName = sc.next();

			System.out.println(s1.studId + " " + s1.studName);
		}
	}

}

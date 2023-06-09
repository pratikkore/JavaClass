package Day12ArrayObject;

import java.util.Arrays;
import java.util.Scanner;

class Student {
	int id;
	String name;
	int[] marks;

	public Student(int sId, String sName, int[] sMarks) {
		this.id = sId;
		this.name = sName;
		this.marks = sMarks;
	}
//	@Override

//	public String toString() {
//		return id + " " + name + " " + marks;
//	}
}

public class StudentMarksObj {

	public static void main(String[] args) {

		Student stud[] = new Student[2];
		for (int j = 0; j < stud.length; j++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Student id ..");
			int sId = sc.nextInt();
			System.out.println("Enter Student Name..");
			String sName = sc.next();
			int sMarks[] = new int[2];
			for (int i = 0; i < sMarks.length; i++) {
				System.out.println("Enter Student marks of subject  " + (i + 1));
				sMarks[i] = sc.nextInt();
			}

			stud[j] = new Student(sId, sName, sMarks);
		}
//		System.out.println(Arrays.toString(stud));

		for (Student s : stud) {
			int total = 0;
			double avg = 0;

			System.out.println(s.id + " " + s.name + " " + Arrays.toString(s.marks));
			for (int m : s.marks) {
				total = total + m;
			}
			avg = total / s.marks.length;
			System.out.println("Avg of Student " + avg);
			if (avg > 60) {
				System.out.println("Pass");
			} else {
				System.out.println("Fail");
			}
		}

	}
}

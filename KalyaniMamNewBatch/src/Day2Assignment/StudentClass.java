package Day2Assignment;

import java.util.Scanner;

public class StudentClass {

	int id, sub1, sub2, sub3, percent;
	String name;

	public void acceptDetails() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student id...");
		id = sc.nextInt();
		System.out.println("Enter Student name...");
		name = sc.next();
		System.out.println("Enter Student first sub marks...");
		sub1 = sc.nextInt();
		System.out.println("Enter Student second sub marks...");
		sub2 = sc.nextInt();
		System.out.println("Enter Student third sub marks...");
		sub3 = sc.nextInt();
	}

	void percentage() {
		percent = (int) ((sub1 + sub2 + sub3) * 0.3333);
//		System.out.println("Percentage of marks " + percent + "%");
	}

	void displayDetails() {
		System.out.println(" Student Id is : " + id + "\n Student name is : " + name + "\n Student Sub 1 marks : "
				+ sub1 + "\n Student sub 2 marks : " + sub2 + "\n Student sub 3 marks : " + sub3
				+ "\n Student total percentage : " + percent + "%");
		System.out.println("-----------------------------------------------------------------");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentClass stud1 = new StudentClass();
		stud1.acceptDetails();
		stud1.percentage();

		StudentClass stud2 = new StudentClass();
		stud2.acceptDetails();
		stud2.percentage();

		StudentClass stud3 = new StudentClass();
		stud3.acceptDetails();
		stud3.percentage();

		stud1.displayDetails();
		stud2.displayDetails();
		stud3.displayDetails();
	}

}

package classandobject;

import java.util.Scanner;

public class MainStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ParametrizedStudent student1 = new ParametrizedStudent();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user Name 1 -");
		String name = sc.next();
		System.out.println("Enter user mail 1 -");
		String mail = sc.next();
		System.out.println("Enter user department 1 -");
		String department = sc.next();
		System.out.println("Enter user marks 1 -");
		double marks = sc.nextDouble();

		student1.setData(name, mail, department, marks);

		System.out.println("Enter user Name 2 -");
		name = sc.next();
		System.out.println("Enter user mail 2 -");
		mail = sc.next();
		System.out.println("Enter user department 2 -");
		department = sc.next();
		System.out.println("Enter user marks 2 -");
		marks = sc.nextDouble();
		ParametrizedStudent student2 = new ParametrizedStudent();

		student2.setData(name, mail, department, marks);

		System.out.println("Enter user Name 3 -");
		name = sc.next();
		System.out.println("Enter user mail 3 -");
		mail = sc.next();
		System.out.println("Enter user department 3 -");
		department = sc.next();
		System.out.println("Enter user marks 3 -");
		marks = sc.nextDouble();
		ParametrizedStudent student3 = new ParametrizedStudent();

		student3.setData(name, mail, department, marks);

		student1.displayStudent("Student 1 Data :");
		student2.displayStudent("Student 2 Data :");
		student3.displayStudent("Student 3 Data :");
	}

}
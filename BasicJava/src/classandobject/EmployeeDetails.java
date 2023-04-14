package classandobject;

import java.util.Scanner;

public class EmployeeDetails {
	int id;
	String name, department, contact;
	double salary;

	void setData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user id,name,department,contact,salary...");
		int i = sc.nextInt();
		String n = sc.next();
		String d = sc.next();
		String c = sc.next();
		double s = sc.nextDouble();

		id = i;
		name = n;
		department = d;
		contact = c;
		salary = s;

//		display();
	}

	void display() {
		System.out.println(id + " " + name + " " + department + " " + contact + " " + salary + " ");
	}

}
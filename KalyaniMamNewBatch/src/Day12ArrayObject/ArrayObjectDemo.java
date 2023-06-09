package Day12ArrayObject;

import java.util.Scanner;

class Employee {
	int id;
	String name;
	long salary;

	public Employee(int id, String name, long salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return id + " " + name + " " + " " + salary;
	}
}

public class ArrayObjectDemo {

	public static void main(String[] args) {

		Employee Emp[] = new Employee[2];
		Scanner sc = new Scanner(System.in);
		for (int j = 0; j < Emp.length; j++) {

			System.out.println("Enter Employee Id ");
			int eId = sc.nextInt();
			System.out.println("Enter Employee Name ");
			String eName = sc.next();
			System.out.println("Enter Employee salaray ");
			long eSalary = sc.nextLong();
			Emp[j] = new Employee(eId, eName, eSalary);
		}

//		System.out.println(Arrays.toString(Emp));

		for (Employee e : Emp) {
			if (e.salary > 20000) {
				System.out.println(e);
			}
//			System.out.println(e);

		}
	}
}

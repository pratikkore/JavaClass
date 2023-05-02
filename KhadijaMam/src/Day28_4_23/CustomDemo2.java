package Day28_4_23;

import java.util.ArrayList;
import java.util.Scanner;

class Department {
	int dId;
	String dName;
	Employee e;

	public Department() {
	}

	public Department(int dId, String dName, Employee e) {
		super();
		this.dId = dId;
		this.dName = dName;
		this.e = e;
	}

	@Override
	public String toString() {
		return "dId=" + dId + ", dName=" + dName + ", e=" + e;
	}

	public static void display(ArrayList<Department> arr) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter department name : ");
		String user = sc.next();
		boolean isPresent = false;
		int count = 0;

		for (int i = 0; i < arr.size(); i++) {
			if (user.contains(arr.get(i).dName)) {
				count++;
				System.out.println(arr.get(i));
				isPresent = true;
			}
		}
		System.out.println("number of Employess found in this  Department " + count);
		System.out.println("*************************************************************");

		if (!isPresent) {
			System.out.println("Not Available Department ..");
		}
	}

	public static void showSalary(ArrayList<Department> arr) {
		Department maxSal = arr.get(0);
		for (int i = 0; i < arr.size(); i++) {

			if (arr.get(i).e.salary > maxSal.e.salary) {
				maxSal = arr.get(i);
			}
		}
		System.out.println("Maximum Salary employee ..");
		System.out.println(maxSal);

	}
}

class Employee {
	int eId;
	String name;
	float salary;

	public Employee(int eId, String name, float salary) {
		super();
		this.eId = eId;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "eId=" + eId + ", name=" + name + ", salary=" + salary;
	}
}

public class CustomDemo2 {

	public static void main(String[] args) {

		ArrayList<Department> arr = new ArrayList<Department>();
		arr.add(new Department(1, "hr", new Employee(101, "pooja", 18000)));
		arr.add(new Department(2, "marketing", new Employee(102, "sonali", 12000)));
		arr.add(new Department(3, "development", new Employee(103, "monali", 80000)));
		arr.add(new Department(4, "hr", new Employee(104, "pooja", 18000)));

		Department d = new Department();
//		Department.display(arr);
		Department.showSalary(arr);
	}
}

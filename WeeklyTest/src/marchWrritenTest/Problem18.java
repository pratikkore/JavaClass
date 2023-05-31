package marchWrritenTest;

import java.util.Scanner;

//

//18.Write a java program to create array of 3 employees. 
//Take input or hardcode for all 3 employees from console. 
//Employee class is as follows Employee { int id , String name, Dept d }
//Dept { int deptid , String dname}
//Make use of constructor of Emp and Dept to create employee objects

class Employee {
	int id;
	String name;
	Dept d;

	public Employee(int id, String name, Dept d) {
		super();
		this.id = id;
		this.name = name;
		this.d = d;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

}

class Dept {
	int deptId;
	String deptName;

	public Dept(int deptId, String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "dept [deptId=" + deptId + ", deptName=" + deptName + "]";
	}

}

public class Problem18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee[] emp = new Employee[3];
		for (int i = 0; i < emp.length; i++) {
			System.out.println("Enter details for Employee " + (i + 1) + ":");

			System.out.println("Employee ID :");
			int id = sc.nextInt();

			System.out.println("Employee Name :");
			String name = sc.next();

			System.out.print("Department ID: ");
			int deptId = sc.nextInt();

			System.out.print("Department Name: ");
			String deptName = sc.next();

			Dept dept = new Dept(deptId, deptName);
			emp[i] = new Employee(id, name, dept);

			System.out.println();
		}
		System.out.println("Employee Details:");
		for (Employee employee : emp) {
			System.out.println("Employee ID: " + employee.id);
			System.out.println("Employee Name: " + employee.name);
			System.out.println("Department ID: " + employee.d.deptId);
			System.out.println("Department Name: " + employee.d.deptName);
			System.out.println();
		}
	}
}

package Test6;

class Employee {
	int empno;
	String name;
	Department dept;

	public Employee(int empno, String name, Department dept) {
		super();
		this.empno = empno;
		this.name = name;
		this.dept = dept;
	}
}

class Department {
	int deptId;
	String deptName;

	public Department(int deptId, String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	}
}

public class Problem13 {

	public static void main(String[] args) {

		Employee[] arr = new Employee[3];

		arr[0] = new Employee(1, "Pratik", new Department(101, "Developer"));
		arr[1] = new Employee(2, "Jayanti", new Department(102, "WebDeveloper"));
		arr[2] = new Employee(3, "Xyz", new Department(103, "Technical"));
	}

}

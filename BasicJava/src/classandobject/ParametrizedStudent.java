package classandobject;

public class ParametrizedStudent {

	String name, email, department;
	double marks;

	void setData(String name, String email, String department, double marks) {
		this.name = name;
		this.email = email;
		this.department = department;
		this.marks = marks;
	}

	void displayStudent(String std) {
		System.out.println(std);
		System.out.println(name + " " + email + " " + department + " " + marks + " ");
		System.out.println("----------------------------------------------------");
	}
}

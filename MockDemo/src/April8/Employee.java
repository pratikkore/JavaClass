package April8;

class Passport {

	int id, Validity;

	public Passport(int id, int validity) {

		setId(id);
		setValidity(validity);

		System.out.println("Employee Id = " + getId());
		System.out.println("Employee Validity = " + getValidity());

	}

	void setId(int id) {
		this.id = id;
	}

	int getId() {
		return this.id;
	}

	void setValidity(int Validity) {
		this.Validity = Validity;
	}

	int getValidity() {
		return this.Validity;
	}

}

public class Employee {

	public Employee(int id, int validity, Passport p) {
		System.out.println("Constructor");

	}

	int id, age;
	String name;
	int salary;

	public static void main(String[] args) {

		new Employee(1, 5, new Passport(4, 21));
//		new Passport(2, 6);

	}

}

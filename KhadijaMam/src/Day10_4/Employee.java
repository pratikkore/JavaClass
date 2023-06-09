package Day10_4;

import java.util.Date;

//import java.sql.Date;

public class Employee {

	int e_id;
	String name;
	Passport p;

	public Employee(int e_id, String name, Passport p) {
		this.e_id = e_id;
		this.name = name;
		this.p = p;
	}

	@Override
	public String toString() {
		return e_id + " " + name + " " + p.p_no + " " + p.issue_date + " " + p.validity;
	}

	public static void main(String[] args) {

		Date d = new Date();
		System.out.println(d);
		Passport p = new Passport(323, d, 10);
		Employee e = new Employee(102, "Pratik", p);
		System.out.println(e);

		Employee e1 = e;
		System.out.println(e1);

	}

}

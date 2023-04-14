package classandobject;

public class ParametrizedEmployee {
	int id;
	String name, department, contact;
	double salary;

	void setData(int i, String n, String c, String d, double s) {
		id = i;
		name = n;
		department = d;
		contact = c;
		salary = s;
	}

	void display() {
		System.out.println(id + " " + name + " " + department + " " + contact + " " + salary + " ");
	}

}

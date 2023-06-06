package FileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

class Employee implements Serializable {
	int id;
	String name;
	float salary;
	transient int pincode;

	public Employee(int id, String name, float salary, int pincode) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", pincode=" + pincode + "]";
	}

}

public class ObjectOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		File f = new File("D:/file_hand/emp.dat");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		ArrayList<Employee> al = new ArrayList<>();

		Employee e1 = new Employee(1, "pooja", 23000, 1111);
		Employee e2 = new Employee(2, "ram", 20000, 2222);
		Employee e3 = new Employee(3, "sonal", 23000, 3333);
		Employee e4 = new Employee(4, "rupali", 25000, 4444);
		Employee e5 = new Employee(5, "sonali", 29000, 5555);

		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);

		oos.writeObject(al);
		System.out.println("file written sucessfully");
		oos.close();
	}

}

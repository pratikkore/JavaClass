package Day23FailFast;

import java.util.ArrayList;
import java.util.Iterator;

class Emp {
	int id;
	String eName;
	int salary;

	public Emp(int id, String eName, int salary) {
		super();
		this.id = id;
		this.eName = eName;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return " id=" + id + ", eName=" + eName + ", salary=" + salary;
	}
}

public class Employee {

	public static void main(String[] args) {

		ArrayList<Emp> list = new ArrayList<Emp>();
		list.add(new Emp(1, "abc", 40000));
		list.add(new Emp(2, "pqr", 70000));
		list.add(new Emp(3, "xyz", 23000));

		System.out.println(list);
		System.out.println("***********************************************");

		System.out.println("This empolyee has more than 60k salary...");

//		for (Emp e : list) {
//			if (e.salary > 60000) {
//				System.out.println(e);
//			}
//		}

		Iterator<Emp> a = list.iterator();
		while (a.hasNext()) {
			Emp xEmp = a.next();
			if (xEmp.salary > 60000) {
				System.out.println(xEmp);
			}
		}
	}
}

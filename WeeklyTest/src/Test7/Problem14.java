package Test7;

class Employee {
	String name;
	int eid;
	int mgrid;

	public Employee(String name, int eid, int mgrid) {
		super();
		this.name = name;
		this.eid = eid;
		this.mgrid = mgrid;
	}
}

class Manager {
	int mId;
	String mName;

	public Manager(int mId, String mName) {
		super();
		this.mId = mId;
		this.mName = mName;
	}

}

public class Problem14 {

	public static void main(String[] args) {

		Employee[] arr = { new Employee("ab", 2, 202), new Employee("wb", 3, 203), new Employee("qb", 4, 202),
				new Employee("tb", 5, 204), new Employee("Pratik", 6, 204) };

		Manager[] arr2 = { new Manager(202, "ABc"), new Manager(203, "XYZ"), new Manager(204, "PQR") };

		for (Employee e : arr) {
			for (Manager m : arr2) {
				if (e.mgrid == m.mId) {
					System.out.println(e.name + " - " + m.mName);
				}
			}
		}

	}

}

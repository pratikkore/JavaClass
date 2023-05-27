package Assignment_set_map_queue;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TreeSet;

class Employee implements Comparable<Employee> {
	int id;
	String name;
	int salary;
	Department dep;

	public Employee(int id, String name, int salary, Department dep) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dep = dep;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.id - o.id;
	}

}

class Department {
	int dId;
	String dName;

	public Department(int dId, String dName) {
		super();
		this.dId = dId;
		this.dName = dName;
	}

	@Override
	public String toString() {
		return "Department [dId=" + dId + ", dName=" + dName + "]";
	}

	@Override
	public int hashCode() {
		return dId;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return dId == other.dId && Objects.equals(dName, other.dName);
	}

}

public class Problem1 {

	public static void main(String[] args) {

		TreeSet<Employee> ts = new TreeSet<Employee>();

		ts.add(new Employee(1, "Pratik", 20000, new Department(101, "Hr")));
		ts.add(new Employee(2, "ram", 43000, new Department(102, "it")));
		ts.add(new Employee(3, "ravi", 55000, new Department(103, "mech")));
		ts.add(new Employee(4, "pavan", 10000, new Department(101, "Hr")));
		ts.add(new Employee(5, "raj", 28000, new Department(105, "entc")));

//		System.out.println(ts);

		HashMap<Department, Integer> hm = new HashMap<>();
		HashMap<Department, Integer> hm1 = new HashMap<>();

		for (Employee t : ts) {
			if (hm.containsKey(t.dep)) {
				Integer v = hm.get(t.dep);
				hm.put(t.dep, v + t.salary);
				hm1.put(t.dep, hm1.get(t.dep) + 1);
			} else {
				hm.put(t.dep, t.salary);
				hm1.put(t.dep, 1);

			}
		}
//		System.out.println(hm1);

		for (Map.Entry<Department, Integer> m : hm.entrySet()) {
			Integer c = hm1.get(m.getKey());
			hm.put(m.getKey(), m.getValue() / c);
		}
		for (Map.Entry<Department, Integer> m : hm.entrySet()) {
			System.out.println("Departmnt id -" + m.getKey().dId + " Department name -" + m.getKey().dName
					+ " Averge salary -" + m.getValue());
		}
	}

}

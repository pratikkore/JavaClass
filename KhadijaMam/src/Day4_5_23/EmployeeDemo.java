package Day4_5_23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee {
	int id;
	String name;
	Profile profile;

	public Employee(int id, String name, Profile profile) {
		super();
		this.id = id;
		this.name = name;
		this.profile = profile;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ",Profile" + profile;
	}

}

class Profile {
	String country;
	String state;

	public Profile(String country, String state) {
		super();
		this.country = country;
		this.state = state;
	}

	@Override
	public String toString() {
		return "country=" + country + ", state=" + state;
	}

}

class NameSort implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1.name.equals(o2.name)) {
			return o1.id - o2.id;
		} else {
			return o1.name.compareTo(o2.name);
		}
	}
}

class CountrySort implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1.profile.country.equals(o2.profile.country)) {
			return o1.profile.country.compareTo(o2.profile.country);
		} else {
			return o1.profile.state.compareTo(o2.profile.state);
		}
	}

}

public class EmployeeDemo {

	public static void main(String[] args) {

		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(1, "john", new Profile("usa", "texas")));
		al.add(new Employee(2, "pratik", new Profile("india", "maharastra")));
		al.add(new Employee(-2, "pratik", new Profile("uk", "england")));
		al.add(new Employee(4, "abc", new Profile("china", "hongkong")));
		System.out.println("Before Sorting ..");
		System.out.println(al);

		Collections.sort(al, new NameSort());
		System.out.println("Sorting on name and id");
		System.out.println(al);

		Collections.sort(al, new CountrySort());
		System.out.println("Sorting country ");
		System.out.println(al);

	}

}

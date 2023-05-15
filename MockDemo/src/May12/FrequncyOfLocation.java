package May12;

import java.util.ArrayList;
import java.util.HashMap;

class Department {
	int id;
	String name;
	Location loc;

	public Department(int id, String name, Location loc) {
		super();
		this.id = id;
		this.name = name;
		this.loc = loc;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", loc=" + loc + "]";
	}

}

class Location {
	int pin;
	String city;

	public Location(int pin, String city) {
		super();
		this.pin = pin;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Location [pin=" + pin + ", city=" + city + "]";
	}

}

public class FrequncyOfLocation {

	public static void main(String[] args) {
		ArrayList<Department> al = new ArrayList<>();
		al.add(new Department(1, "hr", new Location(412123, "mumbai")));
		al.add(new Department(2, "it", new Location(415434, "banglore")));
		al.add(new Department(3, "sales", new Location(412974, "mumbai")));

		HashMap<String, Integer> hm = new HashMap<>();
		for (Department d : al) {
			if (hm.containsKey(d.loc.city)) {
				int c = hm.get(d.loc.city);
				hm.put(d.loc.city, c + 1);

			} else {
				hm.put(d.loc.city, 1);
			}
		}

		System.out.println(hm);

	}

}

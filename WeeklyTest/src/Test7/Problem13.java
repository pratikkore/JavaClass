package Test7;

import java.util.ArrayList;

class Players {
	int id;
	String name, country, team;

	public Players(int id, String name, String country, String team) {
		super();
		this.id = id;
		this.name = name;
		this.country = country;
		this.team = team;
	}

}

public class Problem13 {

	public static void main(String[] args) {

		ArrayList<Players> al = new ArrayList<Players>();

		al.add(new Players(7, "Dhoni", "India", "CSK"));
		al.add(new Players(31, "warner", "Australia", "DC"));

		al.add(new Players(49, "maxwell", "Australia", "RCB"));

		al.add(new Players(18, "virat", "India", "RCB"));

		for (Players p : al) {
			if (p.country.equals("Australia")) {
				System.out.println(p.name + " - " + p.team);
			}
		}

	}

}

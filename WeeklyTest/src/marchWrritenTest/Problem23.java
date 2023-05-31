package marchWrritenTest;

import java.util.TreeSet;

//23.Assume TreeSet<Train> is present. 
//Train contains id,name and totalSeats.TreeSet should be sorted on totalSeats.

class Train implements Comparable<Train> {
	private int id;
	private String name;
	int totalSeats;

	public Train(int id, String name, int totalSeats) {
		super();
		this.id = id;
		this.name = name;
		this.totalSeats = totalSeats;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", totalSeats=" + totalSeats;
	}

	public int compareTo(Train o) {
		return Integer.compare(this.totalSeats, o.totalSeats);
	};
}

public class Problem23 {

	public static void main(String[] args) {
		TreeSet<Train> ts = new TreeSet<Train>();
		ts.add(new Train(1, "Pune express", 223));
		ts.add(new Train(4, "mumbai express", 323));
		ts.add(new Train(3, "delhi express", 250));
		ts.add(new Train(2, "chennai express", 430));

		System.out.println("sorted on number of seats : ");
		for (Train t : ts) {
			System.out.println(t.totalSeats);
		}
	}
}

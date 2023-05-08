package Day27MapMultiValue;

import java.util.HashMap;
import java.util.Map;

class Train {
	int id;
	String name;
	int noSeat;

	public Train(int id, String name, int noSeat) {
		super();
		this.id = id;
		this.name = name;
		this.noSeat = noSeat;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", noSeat=" + noSeat;
	}

	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		if (this.id != other.id) {
			return false;
		}
		return true;
	}
}

public class TrainMap {

	public static void main(String[] args) {

		HashMap<Train, Integer> hMap = new HashMap<>();

		hMap.put(new Train(1, "abc", 80), 2000);
		hMap.put(new Train(2, "xyz", 50), 3200);
		hMap.put(new Train(1, "pqr", 20), 1500);

		for (Map.Entry<Train, Integer> m : hMap.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}

}

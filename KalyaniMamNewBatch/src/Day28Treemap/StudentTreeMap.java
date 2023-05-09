package Day28Treemap;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Student {
	int id;
	String name;
	float marks;

	public Student(int id, String name, float d) {
		super();
		this.id = id;
		this.name = name;
		this.marks = d;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", marks=" + marks;
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
		Student other = (Student) obj;
		return id == other.id && Float.floatToIntBits(marks) == Float.floatToIntBits(other.marks)
				&& Objects.equals(name, other.name);
	}

}

public class StudentTreeMap {

	public static void main(String[] args) {

		HashMap<Student, Integer> al = new HashMap<>();

		al.put(new Student(1, "abc", 90), 2);
		al.put(new Student(2, "xyz", 67), 3);
		al.put(new Student(3, "Pqr", 76), 4);
		al.put(new Student(5, "ewq", 54), 5);
		al.put(new Student(1, "abc", 90), 6);

		for (Map.Entry<Student, Integer> m : al.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

}

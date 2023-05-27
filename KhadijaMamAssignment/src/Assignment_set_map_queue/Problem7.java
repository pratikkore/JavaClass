package Assignment_set_map_queue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

class Student9 {

	int id;
	String name;

	public Student9(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name;
	}

}

class Course implements Comparable<Course> {
	int id;
	String name;
	int fee;

	public Course(int id, String name, int fee) {
		super();
		this.id = id;
		this.name = name;
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", fee=" + fee;
	}

	@Override
	public int compareTo(Course o) {
		return o.fee - this.fee;
	}

}

public class Problem7 {

	public static void main(String[] args) {
		HashMap<Student9, Course> hm = new HashMap<Student9, Course>();

		hm.put(new Student9(1, "Pratik"), new Course(101, "java", 20000));
		hm.put(new Student9(2, "ram"), new Course(102, "Html", 32000));
		hm.put(new Student9(3, "ravan"), new Course(103, "react", 22000));
		hm.put(new Student9(4, "hanuman"), new Course(104, "angular", 120000));
		hm.put(new Student9(5, "laxman"), new Course(105, "mongodb", 42000));

		Collection<Course> cs = hm.values();
		ArrayList<Course> al = new ArrayList<>(cs);

		Collections.sort(al);
		for (Course a : al) {
			System.out.println(a);
		}
	}

}

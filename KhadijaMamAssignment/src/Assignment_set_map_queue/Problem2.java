package Assignment_set_map_queue;

import java.util.ArrayList;
import java.util.TreeSet;

class Student implements Comparable<Student> {
	int id;
	String name;
	int marks;

	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", marks=" + marks;
	}

	@Override
	public int compareTo(Student o) {
		return o.marks - this.marks;
	}

}

public class Problem2 {

	public static void main(String[] args) {

		TreeSet<Student> ts = new TreeSet<Student>();
		ts.add(new Student(1, "Pratik", 89));
		ts.add(new Student(3, "ram", 45));
		ts.add(new Student(2, "pravin", 98));
		ts.add(new Student(4, "kiran", 55));

		ArrayList<Student> al = new ArrayList<Student>(ts);

		System.out.println("Sorted In Desending Order...");
		for (Student i : al) {
			System.out.println(i);
		}

	}

}

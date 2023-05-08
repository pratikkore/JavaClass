package Day4_5_23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
	int rollNo;
	String name;
	int age;

	public Student(int rollNo, String name, int age) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "rollNo=" + rollNo + ", name=" + name + ", age=" + age;
	}
}

class RollNoSort implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {

		return o1.rollNo - o2.rollNo;
	}

}

class NameSorting implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.name.compareTo(o2.name);
	}

}

class AgeSorting implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.age - o2.age;
	}

}

public class ComparatorDemo {

	public static void main(String[] args) {

		ArrayList arr = new ArrayList();

		arr.add(new Student(10, "abc", 21));
		arr.add(new Student(2, "cba", 19));
		arr.add(new Student(3, "bac", 25));
		arr.add(new Student(4, "cab", 23));

		System.out.println("Before roll no sorting");
		System.out.println(arr);

		System.out.println("*********************************************");
		Collections.sort(arr, new RollNoSort());
		System.out.println("After RollNumber Sorting");
		System.out.println(arr);

		System.out.println("**********************************************");

		Collections.sort(arr, new NameSorting());
		System.out.println("After name Sorting..");
		System.out.println(arr);

		System.out.println("**********************************************");

		Collections.sort(arr, new AgeSorting());
		System.out.println("After age Sorting..");
		System.out.println(arr);

	}

}

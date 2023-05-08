package Day24ListInArraylist;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
	int sId;
	String sName;
	Integer sMarks;

	public Student(int sId, String sName, Integer sMarks) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sMarks = sMarks;
	}

	@Override
	public String toString() {
		return "sId=" + sId + ", sName=" + sName + ", sMarks=" + sMarks;
	}

	@Override
	public int compareTo(Student o) {
		return this.sMarks - o.sMarks;

	}

}

public class SortArrayList {

	public static void main(String[] args) {

		ArrayList<Student> a = new ArrayList<Student>();

		a.add(new Student(1, "Pratik", 59));
		a.add(new Student(2, "abc", 98));
		a.add(new Student(3, "xyz", 87));

		for (Student s : a) {
			System.out.println(s);
//			Collections.sort(s);

		}
		System.out.println("***************************************");
		Collections.sort(a);

		for (Student s : a) {
			System.out.println(s);
		}

	}
}

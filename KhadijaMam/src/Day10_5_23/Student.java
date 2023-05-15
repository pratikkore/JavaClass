package Day10_5_23;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

class Student1 {
	int id;
	String name;
	int per;

	public Student1() {
	}

	public Student1(int id, String name, int per) {
		super();
		this.id = id;
		this.name = name;
		this.per = per;
	}

	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + ", per=" + per + "]";
	}

	public void display(HashMap<String, String> map) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Name :");
		String user = sc.next();

		Set myMap = map.entrySet();
		Iterator<Map.Entry<String, String>> it = myMap.iterator();
		while (it.hasNext()) {
			Map.Entry<String, String> m1 = it.next();
			if (m1.getKey().equals(name))
				System.out.println(m1.getKey() + " " + m1.getValue());
		}

	}

}

public class Student {

	public static void main(String[] args) {

		ArrayList<Student1> al = new ArrayList<Student1>();

		al.add(new Student1(1, "ram", 95));
		al.add(new Student1(2, "sonal", 50));
		al.add(new Student1(3, "pooja", 75));
		HashMap<String, String> map = new HashMap<>();

		Iterator<Student1> itr = al.iterator();
		String grade = "";

		while (itr.hasNext()) {

			Student1 a = itr.next();
			if (a.per > 85) {
				grade = "A+";
			} else if (a.per <= 75 || a.per >= 60) {
				grade = "B+";
			} else if (a.per <= 40) {
				grade = "Fail";
			}
			map.put(a.name, grade);
		}
		Set<Entry<String, String>> e = map.entrySet();
		for (Map.Entry<String, String> m : e) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}
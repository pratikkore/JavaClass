package Day8_5_23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student {
	int id;
	String name;
	List<String> hobbies;

	public Student(int id, String name, List<String> hobbies) {
		super();
		this.id = id;
		this.name = name;
		this.hobbies = hobbies;
	}
}

public class LinkList {

	public static void main(String[] args) {

		List<Student> l = new ArrayList<Student>();
		l.add(new Student(1, "Pratik", new ArrayList<>(Arrays.asList("Reading", "Watching"))));
		l.add(new Student(2, "Xyz", new ArrayList<>(Arrays.asList("Playing", "Traavling"))));

		for (Student s : l) {
			System.out.println(s.name + "-" + s.hobbies);
		}

	}

}

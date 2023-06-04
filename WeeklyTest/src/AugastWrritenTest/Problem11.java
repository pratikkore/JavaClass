package AugastWrritenTest;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class Tes {
	int tid;
	int sid;
	int marks;

	public Tes(int tid, int sid, int marks) {
		this.tid = tid;
		this.sid = sid;
		this.marks = marks;
	}

	public int getSid() {
		return sid;
	}

	public int getMarks() {
		return marks;
	}
}

class Student {
	int sid;
	int totalMarks;

	public Student(int sid, int totalMarks) {
		this.sid = sid;
		this.totalMarks = totalMarks;
	}

	public int getTotalMarks() {
		return totalMarks;
	}

	@Override
	public String toString() {
		return "Student{" + "sid=" + sid + ", totalMarks=" + totalMarks + '}';
	}
}

public class Problem11 {

	public static void main(String[] args) {
		ArrayList<Tes> testList = new ArrayList<>();

		Map<Integer, Integer> studentMarksMap = testList.stream()
				.collect(Collectors.groupingBy(Tes::getSid, Collectors.summingInt(Tes::getMarks)));
		Set<Student> studentSet = studentMarksMap.entrySet().stream()
				.map(entry -> new Student(entry.getKey(), entry.getValue()))
				.sorted(Comparator.comparingInt(Student::getTotalMarks).reversed())
				.collect(Collectors.toCollection(LinkedHashSet::new));

		studentSet.forEach(System.out::println);
	}
}

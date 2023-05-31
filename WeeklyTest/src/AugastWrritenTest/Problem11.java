package AugastWrritenTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;
//11)Consider an ArrayList<Test>and  test has  {tid,sid,marks} .
//Create a Set<Student> Student{sid,totalmarks}  
//from the list and sort the set in descending order of totalmarks.

class Student implements Comparable<Student> {
	int sId;
	int totalMarks;

	public Student(int sId, int totalMarks) {
		super();
		this.sId = sId;
		this.totalMarks = totalMarks;
	}

	@Override
	public String toString() {
		return "sId=" + sId + ", totalMarks=" + totalMarks;
	}

	public int compareTo(Student o) {
		return o.totalMarks - this.totalMarks;
	}
}

class total {
	int tid;
	int sId;
	int marks;

	public total(int tid, int sId, int marks) {
		super();
		this.tid = tid;
		this.sId = sId;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "tid=" + tid + ", sId=" + sId + ",marks=" + marks;
	}

}

public class Problem11 {

	public static void main(String[] args) {

		ArrayList<total> al = new ArrayList<total>();
		al.add(new total(1, 1, 90));
		al.add(new total(2, 2, 85));
		al.add(new total(3, 1, 95));
		al.add(new total(4, 3, 80));
		al.add(new total(2, 2, 222));

		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

		for (total t : al) {
			if (hm.containsKey(t.sId)) {
				int tMark = hm.get(t.sId);
				hm.put(t.sId, (t.marks + tMark));
			} else {
				hm.put(t.sId, t.marks);
			}
		}
		TreeSet<Student> hs = new TreeSet<Student>();
		for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
			hs.add(new Student(entry.getKey(), entry.getValue()));
		}
		System.out.println(hs);
	}

}

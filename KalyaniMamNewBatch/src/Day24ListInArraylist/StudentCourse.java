package Day24ListInArraylist;

import java.util.ArrayList;
import java.util.Iterator;

class Student9 {
	int id;
	String name;
	StudentCourse course;

	public Student9(int id, String name, StudentCourse course) {
		this.id = id;
		this.name = name;
		this.course = course;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public StudentCourse getCourse() {
		return course;
	}

	public void setCourse(StudentCourse course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", course=" + course;
	}

}

class StudentCourse {
	private int courseId;
	private String courseName;
	private double courseFee;

	public StudentCourse(int courseId, String courseName, double courseFee) {
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseFee = courseFee;
	}

	public int getCourseId() {
		return courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public double getCourseFee() {
		return courseFee;
	}

	@Override
	public String toString() {
		return "courseId=" + courseId + ", courseName=" + courseName + ", courseFee=" + courseFee;
	}

	public static void main(String[] args) {

		StudentCourse course1 = new StudentCourse(1, "Java Programming", 100.0);
		StudentCourse course2 = new StudentCourse(2, "Python Programming", 150.0);
		StudentCourse course3 = new StudentCourse(3, "Web Development", 200.0);

		Student9 student1 = new Student9(1, "Pratik", course1);
		Student9 student2 = new Student9(2, "abc", course2);
		Student9 student3 = new Student9(3, "xyz", course3);

		ArrayList<Student9> students = new ArrayList<Student9>();
		students.add(student1);
		students.add(student2);
		students.add(student3);

		Iterator itr = students.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}

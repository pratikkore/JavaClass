package AssignmentOnConstructor;

class Course {
	int id;
	String name;

	SubCourse s = new SubCourse();

	public Course() {
		System.out.println("this is course constructor ...");

	}

}

class SubCourse {
	int subCourseId;
	String subCourseName;

	public SubCourse() {
		System.out.println("this is subcourse Constructor ..");
	}
}

public class Problem9 {

	public static void main(String[] args) {

		Course o1 = new Course();
		SubCourse o2 = new SubCourse();

	}

}

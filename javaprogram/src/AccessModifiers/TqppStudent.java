package AccessModifiers;

public class TqppStudent {

	public void checkStudentVariableAccess() {

	}

	public void checkStudentMethodAccess() {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student d = new Student();
		System.out.println("Student Age : " + d.age);
		System.out.println("Student Course Id : " + d.courseId);
		System.out.println("Student Roll Number :" + d.rollNo);
	}

}

package AccessModifiers;

public class Student {

	int rollNo = 1;
	private int admissionNo = 213;
	protected int age = 21;
	public int courseId = 123;

	private void Student1() {
		System.out.println("Hello ");
	}

	protected void Student2() {
		System.out.println("Java");
	}

	public void Student3() {
		System.out.println("check");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student obj = new Student();
		obj.Student1();
		obj.Student2();
		obj.Student3();
	}

}

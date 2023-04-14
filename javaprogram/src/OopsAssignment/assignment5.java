package OopsAssignment;

public class assignment5 {
	int age;
	String name;

	void studentSetData(int a, String n) {
		age = a;
		name = n;
	}

	void displayData() {
		System.out.print("\n student age = " + age + " student name = " + name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		assignment5 s1 = new assignment5();
		assignment5 s2 = new assignment5();

		s1.studentSetData(28, "abc");
		s2.studentSetData(25, "xyz");

		s1.displayData();
		s2.displayData();
	}

}

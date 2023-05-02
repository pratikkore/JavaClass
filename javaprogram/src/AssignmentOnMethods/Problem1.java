package AssignmentOnMethods;

class Student {
	int id;
	String name;

	public void displayData(int id, String name) {
		this.id = id;
		this.name = name;

		System.out.println(id);
		System.out.println(name);
	}
}

public class Problem1 {

	public static void main(String[] args) {

		Student s = new Student();
		s.displayData(1, "Pratik");
	}

}

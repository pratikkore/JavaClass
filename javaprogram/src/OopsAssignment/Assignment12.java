package OopsAssignment;

public class Assignment12 {

//	12) Write a program to copy values of one object into another by assigning the values of
//	one object into another.
	int id, marks;
	String name;

	public void student(int sId, int sMarks, String sName) {
		id = sId;
		marks = sMarks;
		name = sName;
	}

	public void display() {
		System.out.println("Student Id = " + id + " Student marks = " + marks + " Student Name = " + name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Assignment12 obj = new Assignment12();
		obj.student(1, 76, "abc");
		System.out.println(obj.id);
		Assignment12 obj2 = obj;

		obj2.display();

		Assignment12 obj3 = new Assignment12();
		obj3.id = obj.id;
		obj3.marks = obj.marks;
		obj3.name = obj.name;

		obj3.display();

	}

}

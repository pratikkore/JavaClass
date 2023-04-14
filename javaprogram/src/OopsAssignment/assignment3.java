package OopsAssignment;

//3) Write a program for class and object : (main method inside class)

public class assignment3 {

	int id;

	public static void main(String args[]) {
		assignment3 obj = new assignment3();
		obj.id = 1;

//		4) Write a program for class and object : (main outside class)

		student s1 = new student();
		System.out.println(s1.id);
		System.out.println(s1.name);
	}
}

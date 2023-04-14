package OopsAssignment;

//create 2 objects of Student using new keyword

public class student2 {

	void studentOne() {
		System.out.println("this is first student object ");
	}

	void studentTwo() {
		System.out.println("this is second student object ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		student2 obj = new student2();
		obj.studentOne();

		student2 obj1 = new student2();
		obj1.studentTwo();
	}

}

package OopsAssignment;

public class Assignment7 {

//	7) Write a program to create multiple objects of one type only.
//	e.g. Rectangle r1=new Rectangle(), r2=new Rectangle();//creating two objects

	public void Rectangle1() {
		System.out.println("This is first rectangle");
	}

	void Rectangle2() {
		System.out.println("This is second rectangle");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Assignment7 r1 = new Assignment7();
		r1.Rectangle1();

		Assignment7 r2 = new Assignment7();
		r2.Rectangle2();
	}

}

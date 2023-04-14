package Day4Assignment;

public class StudentThis {

	int sId;
	String sName;

	public StudentThis() {
		this(21, "Pratik");
		System.out.println("this is first student ");
	}

	public StudentThis(int id, String name) {
		System.out.println("This is second student ");
		this.sId = id;
		this.sName = name;
	}

	public void Display() {
		System.out.println("\n Student id " + sId + " \n Student Name " + sName);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentThis obj = new StudentThis();

		obj.Display();

	}

}

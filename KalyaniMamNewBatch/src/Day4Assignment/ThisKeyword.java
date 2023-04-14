package Day4Assignment;

public class ThisKeyword {

	int id;
	String name;

	public ThisKeyword() {
		System.out.println("demo of this keyword");
	}

	public ThisKeyword(int id) {
		this();
		System.out.println("parameter");
	}

	public void getData(int id, String name) {

		this.id = id;
		this.name = name;
	}

	public void setData() {
		System.out.println("hiii");
		this.getData(1, "Pratik");
		System.out.println(id + " " + name);
		System.out.println("final");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThisKeyword obj = new ThisKeyword();

		obj.setData();

	}

}

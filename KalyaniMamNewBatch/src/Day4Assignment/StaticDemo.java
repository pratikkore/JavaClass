package Day4Assignment;

public class StaticDemo {

	static int num = 10;

	public void insert() {
		num = 20;
		System.out.println(num);
	}

	public void display() {
		num = 50;
		System.out.println(num);
	}

	static {
		System.out.println("this is block1 ");
	}

	public static void main(String[] args) {

		StaticDemo obj = new StaticDemo();
		obj.insert();
		obj.display();
	}

	static {
		System.out.println("this is block2");
	}

}

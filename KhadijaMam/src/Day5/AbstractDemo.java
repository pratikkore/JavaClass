package Day5;

abstract class Father {
	static String name = "Dell";
	int ram;

	void display() {
		System.out.println("Laptop brand is ..." + name);
	}

	Father() {
		System.out.println("laptop");
	}

	Father(int ram) {
		this();
		this.ram = ram;
	}

	public abstract void DDR4();
}

abstract class laptopWithFingerPrint extends Father {
	public laptopWithFingerPrint() {

		super(16);
	}

	abstract void HdScreen();
}

class Lenova extends laptopWithFingerPrint {
	Lenova() {
		super();
	}

	@Override
	void HdScreen() {
		System.out.println("Providing High Defination Screen ..");
	}

	@Override
	public void DDR4() {
		System.out.println("Providing 16 gb ram.. ");

	}

}

public class AbstractDemo {

	public static void main(String[] args) {
		Lenova l = new Lenova();
		l.display();
		l.DDR4();
		l.HdScreen();

	}

}

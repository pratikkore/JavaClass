package April18;

interface Drawable {
	final int finVar = 10;
	static int StatVar = 20;
	public int PVar = 30;

	void draw();

	default void display() {
		System.out.println("Defulat method with bodies is not allowed interface ...");
	}

	static void display2() {
		System.out.println("Static method allowed in interface with bodies ");
	}
}

interface Printable {
	void print();
}

class Circle implements Drawable, Printable {
	@Override
	public void draw() {
		System.out.println("Circle is drawing ..");
	}

	@Override
	public void print() {
		System.out.println("Print Circle...");
	}
}

class Rectangle implements Drawable {
	@Override
	public void draw() {
		System.out.println("Draw reactangle...");
	}

}

public class InterfaceDemo {

	public static void main(String[] args) {
		Drawable obj = new Circle();
		obj.draw();
//		obj.print();

		Drawable obj2 = new Rectangle();
		obj2.draw();
	}

}

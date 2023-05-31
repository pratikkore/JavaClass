package marchWrritenTest;

//16.	Create anonymous class by Implementing interface & Extending an abstract class.

interface MyInterface {
	void display();
}

abstract class MyAbstractClass {
	abstract void print();
}

public class Problem16 {

	public static void main(String[] args) {
		MyInterface myInterface = new MyInterface() {
			public void display() {
				System.out.println("Implemented display() method in the interface using an anonymous class");
			}
		};

		myInterface.display();

		// Extending abstract class using an anonymous class

		MyAbstractClass myAbstractClass = new MyAbstractClass() {
			@Override
			void print() {
				System.out.println("Implemented print() method in the abstract class using an anonymous class");
			}
		};

		myAbstractClass.print();
	}

}

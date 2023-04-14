package Day9Assignment;

abstract class Vehicle {
	abstract void display1();

	abstract void display2();
}

abstract class Car extends Vehicle {
	@Override
	void display2() {
		System.out.println("class Car ");
	}
}

abstract class BMW extends Car {
	void display3() {
		System.out.println("Class BMW ");
	}
}

class BMW1 extends BMW {
	@Override
	void display1() {
		System.out.println("BMW1");
	}

	void dispplay2() {
		System.out.println("BMW2");

	}
}

public class AbstarctDemo {

	public static void main(String[] args) {

		Vehicle n = new BMW1();
		n.display1();
		n.display2();

	}

}

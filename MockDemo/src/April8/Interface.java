package April8;

interface Animal {
	void legs();
}

class legs implements Animal {
	@Override
	public void legs() {
		System.out.println("Pecock has two legs ...");
	}
}

class Dog implements Animal {
	@Override
	public void legs() {
		System.out.println("dog has four legs ...");
	}
}

public class Interface {

	public static void main(String[] args) {

		Animal a = new legs();
		a.legs();

		Animal b = new Dog();
		b.legs();
	}

}

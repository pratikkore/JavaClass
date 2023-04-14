package Day8Assignment;

class Bird {
	void fly() {
		System.out.println("Every bird can Fly high");
	}
}

class Pecock extends Bird {
	@Override
	public void fly() {
		System.out.println("Pecock is not Flying High ..");
	}
}

class Eagle extends Bird {
	@Override
	public void fly() {
		System.out.println("Eagle flying very high...");
	}
}

public class Overriding {

	public static void main(String[] args) {
		Bird p = new Bird();
		p.fly();

//		Pecock a = new Pecock();
//		a.test();

		Bird b = new Eagle();
		b.fly();
	}

}

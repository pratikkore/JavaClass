package Day11_4_23;

public interface Baking {
	void bake();

	String flvour = "choclate";

	default void mixing() {
		System.out.println("we are introduccing new flavour ");
	}

	static void adding() {

		System.out.println("this is adding " + flvour);
	}

}

class Strawbary implements Baking {
	@Override
	public void bake() {
		System.out.println("this is Strawbary Cake...");
	}
}

class Butterscotch implements Baking {
	@Override
	public void bake() {
		System.out.println("This is ButterScotch cake ...");
	}
}
